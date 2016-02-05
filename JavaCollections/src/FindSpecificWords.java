import java.util.Scanner;
/*
Write a program to find how many times a word appears in given text. The text is given at the first input line.
 The target word is given at the second input line.
 The output is an integer number. Please ignore the character casing. Consider that any non-letter character is a word separator.
 */
public class FindSpecificWords {
    public  static void  main (String args[]) {
        Scanner console=new Scanner(System.in);
        String [] input=console.nextLine().split("[^A-Za-z]");
        String word=console.nextLine();
        int count=0;
        for (int i = 0; i < input.length; i++) {
            if (input[i].equalsIgnoreCase(word)){
                count++;
            }
        }
        System.out.println(count);
    }
}
