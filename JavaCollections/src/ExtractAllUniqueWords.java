import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * At the first line at the console you are given a piece of text. Extract all words from it and print them in alphabetical order.
 * Consider each non-letter character as word separator.
 * Take the repeating words only once. Ignore the character casing. Print the result words in a single line, separated by spaces
 */
public class ExtractAllUniqueWords {
    public  static void  main (String args[]) {
        Scanner console = new Scanner(System.in);
        String [] str=console.nextLine().split("[^a-zA-z]");
        Set<String>result=new HashSet<String>();
        for (String st :str) {
            if (!st.isEmpty()){
                result.add(st.toLowerCase());
            }
        }
        System.out.printf("%s",String.join(" ",result));

    }
}
