import java.util.Arrays;
import java.util.Scanner;

/**Write a program that filters an array of strings, leaving only the strings with length greater than 3 characters. Use .filter()
 */
public class FilterArray {
    public  static void main(String args[]) {
        Scanner console=new Scanner(System.in);
        String [] input =console.nextLine().split(" ");
        StringBuilder result=new StringBuilder();
        Arrays.stream(input).filter(st->st.length()>3).
        forEach(s -> result.append(s + " "));
        if (result.length()>0) {
            System.out.print(result.toString());
        } else {
            System.out.print("(empty)");
        }

    }
}
