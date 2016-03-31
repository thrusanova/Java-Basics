import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by tanya on 3/27/2016.
 */
public class SortArray {
    public static void main (String args[]) {
        Scanner console = new Scanner(System.in);
        String[] numbers = console.nextLine().split(" ");
        Integer [] arr= new Integer[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arr[i]=Integer.parseInt(numbers[i]);
        }
        String input = console.nextLine();
        if (input.equals("Ascending")){
            Arrays.sort(arr);

        }
        else {
            Arrays.sort(arr, Collections.reverseOrder());
        }
        for (Integer i : arr) {
            System.out.print(i.intValue()+" ");
        }
    }

}
