import java.util.ArrayList;
import java.util.Scanner;
/*Write a program that extracts words from a string.
 Words are sequences of characters that are at least two symbols long and consist only of English alphabet letters.
 Use regex.*/
public class 	ExtractWords {
    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        String[] str = console.nextLine().split("[^a-zA-z]");
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            String s = str[i];
            if (!s.equals("") && s.length()>=2) {
                list.add(s);
            }
        }

            System.out.printf("%s", String.join(" ", list));


    }
}