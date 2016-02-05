import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Use the .sorted() method to sort an array of integers. The first line of input is the array. The second is the sorting order.
 */
public class SortArrayWhitStreamApi {
    public static void main(String args[]) {
        Scanner console=new Scanner(System.in);
        String [] input=console.nextLine().split(" ");
        String command=console.nextLine();
        ArrayList<Integer>arr=new ArrayList<Integer>();
        for (int i = 0; i < input.length; i++) {
            arr.add(Integer.parseInt(input[i]));
        }
        Collections.sort(arr);

        if (command.equals("Ascending")) {
            System.out.println(arr);
        }
        else {
            Collections.reverse(arr);
            System.out.println(arr);
        }

    }
}
