import java.util.Scanner;

/**
 *Write a program to count the number of words in given sentence. Use any non-letter character as word separator.
 */
public class CountAllWords {
    public  static void  main (String args[]) {
        Scanner console=new Scanner(System.in);
        String [] input=console.nextLine().split("[^A-Za-z]");
        int count=0;
        for (int i = 0; i < input.length; i++) {
            if (!input[i].isEmpty()){
                count++;
            }
        }
        System.out.println(count);
    }
}
