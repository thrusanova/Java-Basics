import java.util.Scanner;

/**
 * Create a Java program that reads a number N from the console and calculates the sum of all numbers from 1 to N (inclusive).
 */
public class SumNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number=Integer.parseInt(console.nextLine());
        int sum=0;
        for (int i = 1 ; i <= number; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
