import java.util.Scanner;

/**
 * Write a program to find all increasing sequences inside an array of integers.
 * The integers are given in a single line, separated by a space. Print the sequences in the order of their appearance in
 * the input array, each at a single line. Separate the sequence elements by a space. Find also the
 * longest increasing sequence and print it at the last line.
 * If several sequences have the same longest length, print the leftmost of them.
 */
public class LongestIncreasingSequence {
    public static void main (String args[]) {
        Scanner console=new Scanner(System.in);
        String [] str=console.nextLine().split(" ");
        int [] arr=new int[str.length];
      //  ArrayList<Integer>list=new ArrayList<Integer>();
        int maxLen=1;
        int currLen=1;
        int startInd=0;
        for (int i = 0; i < str.length; i++) {
           arr[i]=Integer.parseInt(str[i]);
        }
        for (int i = 0; i < arr.length-1; i++){
            System.out.printf("%s ",arr[i]);
              if (arr[i]> arr[i+1]) {
               System.out.printf("%n");
                  currLen=1;
           }
            else   {
                  currLen++;
              }
            if(currLen>maxLen) {
                maxLen=currLen;
                startInd=i-maxLen+2;
            }
        }
       System.out.println(arr[arr.length-1]);
        System.out.printf("Longest: ");

        for (int i = startInd; i < startInd+maxLen; i++) {
            System.out.printf("%d ",arr[i]);

        }
        }

    }
