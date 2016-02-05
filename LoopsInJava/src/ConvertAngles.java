import java.util.Scanner;

/**
 * Write a method to convert from degrees to radians. Write a method to convert from radians to degrees.
 * You are given a number n and n queries for conversion. Each conversion query will consist of a number + space + measure.
 * Measures are "deg" and "rad". Convert all radians to degrees and all degrees to radians.
 * Print the results as n lines, each holding a number + space + measure. Format all numbers with 6 digit after the decimal poin
 */
public class ConvertAngles {
    public static void main (String args[]) {
        Scanner scn=new Scanner(System.in);
        int number=Integer.parseInt(scn.nextLine());
        for (int i = 0; i < number; i++) {
            String [] angle=scn.nextLine().split(" ");
            double value=Double.parseDouble(angle[0]);
            String measure=angle[1];
            if (measure.equals("rad")) {
                convertToDeg(value);
            }
            else if (measure.equals("deg")) {
                convertToRad(value);
            }
        }
    }
    private static void convertToRad(double value) {
        double number=Math.toRadians(value);
        System.out.printf("%.6f rad",number);
        System.out.println();
    }

    private static void convertToDeg(double value) {
        double number=Math.toDegrees(value);
        System.out.printf("%.6f rad",number);
        System.out.println();
    }
}
