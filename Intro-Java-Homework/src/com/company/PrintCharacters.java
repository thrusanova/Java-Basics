/**
 *Problem 4.	 Print Characters
 Print the characters from ‘a’ to ‘z’ on the console on a single line, separated by a space. Use a for-loop. Note: you can directly declare and increment char in the for-loop. for (char c = ‘a’; …)

 */
public class PrintCharacters {
    public  static  void  main(String []args) {
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i+ " ");
        }
        System.out.println();
    }
}
