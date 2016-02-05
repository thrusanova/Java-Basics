import java.util.Objects;
import java.util.Scanner;

/**
 * Write a program to generate and print all symmetric numbers in given range [start…end]
 * (0 ≤ start ≤ end ≤ 999). A number is symmetric if its digits are symmetric toward its middle.
 * For example, the numbers 101, 33, 989 and 5 are symmetric, but 102, 34 and 997 are not symmetric.
 * Write a program to generate and print all symmetric numbers in given range [start…end] (0 ≤ start ≤ end ≤ 999).
 * A number is symmetric if its digits are symmetric toward its middle. For example, the numbers 101, 33, 989 and 5 are symmetric,
 * but 102, 34 and 997 are not symmetric. Write a program to generate and print all symmetric numbers in given range
 * [start…end] (0 ≤ start ≤ end ≤ 999). A number is symmetric if its digits are symmetric toward its middle.
 * For example, the numbers 101, 33, 989 and 5 are symmetric, but 102, 34 and 997 are not symmetric.
 */
public class SimetricNumber {
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        String [] input =scn.nextLine().split(" ");
        int startNumber=Integer.parseInt(input[0]);
        int endNumber=Integer.parseInt(input[1]);
        for (int i = startNumber; i <= endNumber; i++) {
            String s = Integer.toString(i);
            StringBuilder revS=new StringBuilder();
            revS.append(s);
            revS.reverse();
            String rev=revS.toString();
            if (s.equals(rev))
            {
                System.out.print(s+ " ");
            }


        }
    }

}
