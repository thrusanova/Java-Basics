package com.company;

        import java.util.Scanner;

/**
 * Created by tanya on 1/6/2016.
 */
public class Illuminati {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String projection = console.nextLine();
        int rows = Integer.parseInt(console.nextLine());
        int cols = Integer.parseInt(console.nextLine());

        double places = rows * cols;

        if (projection.equals("Premiere")) {
            System.out.println(String.format("%.2f leva",places * 12));
        }  else if  (projection.equals("Normal")) {
            System.out.println(String.format("%.2f leva", places * 7.5));
        } else {
            System.out.println(String.format("%.2f leva", places * 5));
        }

    }
}
