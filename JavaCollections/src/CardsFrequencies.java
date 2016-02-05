import java.util.HashMap;
import java.util.Scanner;

/**
 * We are given a sequence of N playing cards from a standard deck. The input consists of several cards (face + suit),
 * separated by a space. Write a program to calculate and print at the console the frequency of each card face in format
 * "card_face -> frequency". The frequency is calculated by the formula appearances / N and is expressed in percentages
 * with exactly 2 digits after the decimal point. The card faces with their frequency should be printed in the order
 * of the card face's first appearance in the input.
 * The same card can appear multiple times in the input, but it's face should be listed only once in the output
 */
public class CardsFrequencies {
    public static void  main (String args[]) {
        Scanner console = new Scanner(System.in);
        String[] input = console.nextLine().split(" ");
        HashMap<String, Integer> dict = new HashMap<String, Integer>();
        for (int i = 0; i < input.length; i++) {
            String face = input[i].substring(0,input[i].length()-1);
            if (!dict.containsKey(face)) {
                dict.put(face,0);
            }
                dict.put(face,dict.get(face)+1);
        }
        for (String str :dict.keySet()) {
            float fc=(dict.get(str)/(float)input.length)*100;
            System.out.printf("%s -> %.2f%%\n",str,fc);
        }
    }
}
