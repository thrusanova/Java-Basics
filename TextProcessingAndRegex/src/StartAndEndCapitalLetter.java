import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Write a program that takes as input an array of strings are prints only the words that start and end with capital letter.
 * Words are only strings that consist of English alphabet letters. Use regex.
 */
public class StartAndEndCapitalLetter {
    public  static void  main (String args[]) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        Pattern pattern=Pattern.compile("\\b[A-Z][A-Za-z]*[A-Z]\\b");
        Matcher matcher=pattern.matcher(input);
        while (matcher.find()){
            System.out.print(matcher.group()+" ");
        }
    }
}
