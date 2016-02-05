package com.company;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;
import java.util.stream.Stream;

/**
 * Created by tanya on 12/17/2015.
 */
public class OddEvenPairs {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] str = console.nextLine().trim().split(" ");
        if (str.length % 2 != 0) {
            System.out.println("Invalid length");
        } else {
            for (int i = 0; i < str.length; i+=2) {
                int numberOne = Integer.parseInt(str[i]);
                int numberTwo = Integer.parseInt(str[i + 1]);
                if (numberOne % 2 == 0 && numberTwo % 2 == 0) {
                    String result = String.format("%d, %d -> both are even", numberOne, numberTwo);
                    System.out.println(result);
                }
                if (numberOne % 2 == 1 && numberTwo % 2 == 1) {
                    String result = String.format("%d, %d -> both are odd", numberOne, numberTwo);
                    System.out.println(result);
                }
                if ((numberOne % 2 == 0 && numberTwo % 2 != 0) || (numberOne % 2 != 0 && numberTwo % 2 == 0)) {
                    String result = String.format("%d, %d -> different", numberOne, numberTwo);
                    System.out.println(result);
                }
            }
        }
    }
}
