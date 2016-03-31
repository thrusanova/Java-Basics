import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Write a program that filters an array of strings, leaving only the strings with length greater than 3 characters. Use .filter()
 * Gosho gos pesho pes blabla bla
 * Kogato cyfnat nalymite.
 * To be, or not to be.
 */
public class FilterArray {
    public static void main (String args[]) {
        Scanner console = new Scanner(System.in);
        String[] input = console.nextLine().split(" ");
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            String s = input[i];
            list.add(s);
        }
        list.stream().filter(n -> n.length() > 3).collect(Collectors.toList()).forEach(b -> System.out.print(b+ " "));
        if (list.stream().filter(n -> n.length() > 3).collect(Collectors.toList()).isEmpty()){
            System.out.println("(empty)");
        }
    }
}
