import java.util.Scanner;

/**
 * Problem 7.	Count Substring Occurrences
 Write a program to find how many times given string appears in given text as substring. The text is given at the first input line.
 The search string is given at the second input line. The output is an integer number. Please ignore the character casing.
 */
public class CountSubString {
    public static void  main (String args[]) {
        Scanner console=new Scanner(System.in);
        int count=0;
        String input=console.nextLine();
        String subStr=console.nextLine();
        for (int i = 0; i < input.length()-subStr.length()+1; i++) {
            String s =input.substring(i,i+subStr.length());
            if (subStr.equalsIgnoreCase(s)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
