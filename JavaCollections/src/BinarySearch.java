import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Binary search is an algorithm that works on already sorted arrays. Basically, it goes to the middle element and
 * checks it has to continue searching to the left, or to the right.
 * Return the index of the element, or -1, if the element is not found.
 */
public class BinarySearch {
    public static void  main (String args[]) {
        Scanner console = new Scanner(System.in);
        int n=Integer.parseInt(console.nextLine());
        String [] array=console.nextLine().split(" ");
        ArrayList<Integer>list=new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            int s = Integer.parseInt(array[i]);
            list.add(s);
        }
        Collections.sort(list);
        Integer index=binarySearch(n,list);
        System.out.println(index);

    }

    private static Integer binarySearch(int n, ArrayList<Integer> list) {
        int middleNum=list.get(list.size()/2);
        if (middleNum>n){
            for (int i = middleNum; i >=0; i--) {
                if (list.get(i).equals(n)) {
                    return  i;
                }
            }
        }
        else {
            for (int i = middleNum; i < list.size(); i++) {
                 if (list.get(i).equals(n)) {
                     return i;
                 }
            }
        }
        return -1;
    }
}
