import java.util.Scanner;

/**
 * Write a program that enters an array of strings and finds in it all sequences of equal elements.
 * The input strings are given as a single line, separated by a space.
 */
public class SequencesOfEqualStrings {
    public static void  main (String args[]) {
        Scanner console=new Scanner(System.in);
        String [] input = console.nextLine().split(" ");
        for (int i = 0; i < input.length-1; i++) {
            System.out.printf("%s ", input[i]);
            if (!input[i].equals(input[i+1])) {
                System.out.printf("%n");
            }
        }
        System.out.print(input[input.length-1]);
    }

}

