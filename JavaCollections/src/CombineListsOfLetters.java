import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 *Write a program that reads two lists of letters l1 and l2 and combines them: appends all letters c from l2 to the end of l1,
 *  but only when c does not appear in l1. Print the obtained combined list.
 *  All lists are given as sequence of letters separated by a single space,
 * each at a separate line. Use ArrayList<Character> of chars to keep the input and output lists.
 */
public class CombineListsOfLetters {
    public  static void  main (String args[]) {
        Scanner console = new Scanner(System.in);
        String[] first=console.nextLine().split(" ");
        String[] second=console.nextLine().split(" ");
        ArrayList<String>listOne=new ArrayList<String>();
        ArrayList<String>listTwo=new ArrayList<String>();
        for (int i = 0; i < first.length; i++) {
           listOne.add(first[i]);
        }
        for (int i = 0; i < second.length; i++) {
            listTwo.add(second[i]);
        }

        for (int i = 0; i < second.length; i++) {
                String s=listTwo.get(i);
            if (!listOne.contains(s)) {
                listOne.add(s);
            }
        }
        for (String str :listOne) {
            System.out.print(str+ " ");
        }
    }


    }

