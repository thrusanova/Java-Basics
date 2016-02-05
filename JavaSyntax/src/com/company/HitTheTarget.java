package com.company;

import java.util.Scanner;

/**
 * Created by tanya on 12/17/2015.
 */
public class HitTheTarget {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());
        for (int i = 1; i <=20; i++) {
            for (int j = 1; j <=20; j++){
                if (i+j==number){
                    System.out.print(String.format("%d + %d = %d",i,j,number));
                }
                if (i-j==number){
                    System.out.print(String.format("%d - %d = %d",i,j,number));
                }
            }
            System.out.println();

        }
    }
}
