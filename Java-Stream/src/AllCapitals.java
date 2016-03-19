import java.io.*;

/**
 * Created by tanya on 3/18/2016.
 */
public class AllCapitals {
    public static void main(String args[]) throws IOException {
    try {
        FileReader reader = new FileReader("line.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        String sum ="";
        String line = bufferedReader.readLine();
        while (line != null) {
          {
                sum += line.toUpperCase() + "\r\n";
            }
            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("line.txt")));
            output.write(sum);
            //sum="";
            output.flush();
            line = bufferedReader.readLine();
        }

        bufferedReader.close();
       // output.close();

    } catch (NumberFormatException e) {
        System.out.println("Error");
    }
}
}
