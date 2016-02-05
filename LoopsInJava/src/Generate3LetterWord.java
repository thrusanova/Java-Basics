import java.util.Scanner;

/**
 * Write a program to generate and print all 3-letter words consisting of given set of characters.
 * For example if we have the characters 'a' and 'b', all possible words will be "aaa", "aab", "aba", "abb",
 * "baa", "bab", "bba" and "bbb".
 * The input characters are given as string at the first line of the input. Input characters are unique (
 */
public class Generate3LetterWord {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        char[] arr = str.toCharArray();
        for (char i = 0; i < arr.length; i++) {
            for (char j = 0; j < arr.length; j++) {
                for (char k = 0; k < arr.length; k++) {
                    System.out.print("" + arr[i] + arr[j] + arr[k] + " ");
                }

            }

        }
    }
}