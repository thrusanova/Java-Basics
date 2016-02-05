import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.TreeMap;

public class Excel {
    public static void main (String args[]) throws  Exception {
        try {

            FileInputStream input = new FileInputStream("Report.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook(input);
            XSSFSheet sheet = workbook.getSheetAt(0);
            TreeMap<String, Double> allCities = new TreeMap<String, Double>();
            double totalSum = 0;
            XSSFRow currRow = sheet.getRow(1);
            while (currRow != null) {
                XSSFCell city = currRow.getCell(0);
                String currentCity = city.getStringCellValue();
                XSSFCell totalIncome = currRow.getCell(5);
                double currIncome = totalIncome.getNumericCellValue();
                totalSum += currIncome;
                if (allCities.containsKey(currentCity)) {
                    currIncome += allCities.get(currentCity);
                }
                allCities.put(currentCity, currIncome);
                currRow = sheet.getRow((1 + currRow.getRowNum()));
            }
            for (String city : allCities.keySet()) {
                double income = allCities.get(city);
                System.out.printf("%s -> %.2f %n", city, income);
            }
            System.out.printf("Grant Total -> %.2f", totalSum);
input.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }


    }
}
