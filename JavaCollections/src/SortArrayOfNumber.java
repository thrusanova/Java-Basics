import java.util.Arrays;
import java.util.Scanner;

/**
 *Write a program to enter a number n and n integer numbers and sort and print them.
 *  Keep the numbers in array of integers: int[].
 */
public class SortArrayOfNumber {
    public  static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        int number=Integer.parseInt(scn.nextLine());
        int []arr=new int [number];
        String  st=scn.nextLine();
        String [] str=st.split(" ");
        for (int i = 0; i < str.length; i++) {
            arr[i]=Integer.parseInt(str[i]);
        }
        Arrays.sort(arr);
        for (int num : arr) {
            System.out.printf("%d ",num);
        }
    }
}
