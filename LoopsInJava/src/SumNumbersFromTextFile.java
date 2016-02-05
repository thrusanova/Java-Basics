import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *Write a program to read a text file "Input.txt" holding a sequence of integer numbers, each at a separate line.
 *  Print the sum of the numbers at the console. Ensure you close correctly the file in case of exception or in case of normal execution.
 * In case of exception (e.g. the file is missing), print "Error" as a result.
 */
public class SumNumbersFromTextFile {
    public  static void main (String args[]) throws IOException {
        try {
            FileReader reader=new FileReader("input.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            int sum=0;
            String line = bufferedReader.readLine();
            while (line!=null) {
                sum+=Integer.parseInt(line);
                line=bufferedReader.readLine();
            }
            System.out.println(sum);
            bufferedReader.close();
        }
        catch (NumberFormatException e) {
            System.out.println("Error");
        }
    }
}
