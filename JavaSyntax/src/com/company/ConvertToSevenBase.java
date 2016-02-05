
package com.company;

import java.util.Scanner;

/**
 * Created by tanya on 12/17/2015.
 */
public class ConvertToSevenBase {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number=Integer.parseInt(console.nextLine());
        int baseToConvertTo = 7;
        System.out.println(Integer.toString(number, baseToConvertTo));
    }
}
