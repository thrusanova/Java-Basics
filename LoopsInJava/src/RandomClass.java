import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


/**
 * Write a program to generate n random hands of 5 different cards form a standard suit of 52 cards
 */
public class RandomClass {
    public  static  void main (String args[]) {
        Scanner input = new Scanner(System.in);
        Random random=new Random();
        String[] face = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "D", "K", "A"};
        String[] suit = {"♣", "♦", "♥", "♠"};
        int number = Integer.parseInt(input.nextLine());

        for (int i = 0; i < number; i++) {
            ArrayList<String> list = new ArrayList<String>();
            while (list.size()<5)
            {
                String randFace= face[random.nextInt(13)];
                String randSuit=suit[random.nextInt(4)];
                list.add(randFace+randSuit);
            }

            for (String card:list ) {
                System.out.print(card+ " ");
            }
            System.out.println();
        }
    }
}
