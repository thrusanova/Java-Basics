import java.util.Scanner;

/**
 *Write a program that recursively calculates factorial.
 */
public class Factoriel {
    public static void  main (String args[]) {
        Scanner console = new Scanner(System.in);
        int n=Integer.parseInt(console.nextLine());
        long factotiel=nFactorial(n);
        System.out.println(factotiel);
    }

    private static long nFactorial(int n) {
        if (n==0 || n==1){
            return 1;
        }
         else {
            return  n*nFactorial(n-1);
        }

    }
}
