import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Write a program that reads a text file and prints on the console the sum
 * of the ASCII symbols of each of its lines. Use BufferedReader in combination with FileReader.
 */
public class SumLines {
    public static void main(String args[]) throws IOException {
        try {
            FileReader reader = new FileReader("lines.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            int sum = 0;
            String line = bufferedReader.readLine();
            while (line != null) {
                for (int i = 0; i < line.length(); i++) {
                    sum += line.charAt(i);
                }
                System.out.println(sum);
                sum=0;
                line = bufferedReader.readLine();
            }

            bufferedReader.close();

        } catch (NumberFormatException e) {
            System.out.println("Error");
        }
    }
}


