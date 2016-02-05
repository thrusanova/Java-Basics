import java.util.Scanner;

/**
 * Write a program that enters an array of strings and finds in it the largest sequence of equal elements.
 * If several sequences have the same longest length, print the leftmost of them.
 * The input strings are given as a single line, separated by a space
 */
public class LargestSequenceOfEqualStrings {
    public static void  main (String args[]) {
        Scanner console = new Scanner(System.in);
        String[] input = console.nextLine().split(" ");
        int maxLength = 1;
        int len = 1;
        int startInd=0;
        for (int i = 0; i < input.length-1; i++) {
            if (input[i].equals(input[i+1])) {
                len++;
              //  startInd=i+1;
                if (len>maxLength) {
                    maxLength=len;
                   startInd=i-maxLength+2;
                }
            }
            else    {
                len=1;
            }
        }
        for (int i = startInd; i < startInd+maxLength; i++) {
            System.out.printf("%s ",input[i]);

        }
    }
}
