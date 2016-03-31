import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by tanya on 3/23/2016.
 */
public class ExamScore {
    public static void  main (String args[]) {
        Scanner console = new Scanner(System.in);
        String firstRow = console.nextLine();
        String second = console.nextLine();
        String thrird = console.nextLine();
        String input = console.nextLine();
        StringBuilder sb = new StringBuilder();
        TreeMap<Integer, TreeMap<String, Double>> scores = new TreeMap<>();
        while (!input.equals("--------------------------------------------")) {
            String[] st = input.split("[ |]+");
            sb.append(st[0]);
            sb.append(st[1]);
            sb.append(" ");
            sb.append(st[2]);
            int score = Integer.parseInt(st[3]);
            Double mark = Double.parseDouble(st[4]);
          //  System.out.println(sb.toString());

            if (!scores.containsKey(score)) {
                scores.put(score, new TreeMap<String, Double>());
            }

            TreeMap<String, Double> grades = scores.get(score);
            double gradeCount = 0;
            if (grades.containsKey(sb.toString())) {
                gradeCount = grades.get(sb.toString());
            }
            grades.put(sb.toString(), mark);
            sb.delete(0, sb.length());
            input = console.nextLine();
        }

        for (Integer point : scores.keySet()) {
            System.out.print(point+" -> ");
            System.out.print(scores.get(point).keySet());
            double sum = 0;
            for (double grade : scores.get(point).values()) {
                sum += grade;
            }

            double average = sum / scores.get(point).values().size();
        //    System.out.print(person + ";" + average);
            System.out.printf("; avg=%.2f%n",average);
         }
    }

}