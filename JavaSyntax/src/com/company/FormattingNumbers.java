package com.company;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class FormattingNumbers {
    public  static  void main (String [] args) {
        Scanner console = new Scanner(System.in);
        int a = Integer.parseInt(console.nextLine());
        float b = new Float(console.nextLine());
        float c = new Float(console.nextLine());
        String str = Integer.toHexString(a);
        String st=String.format("%10s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("|%s",str);
        System.out.print("          ");
        System.out.printf("|%s|",st);
        System.out.printf(String.format("%10.2f|", b));
        System.out.printf(String.format("%-10.3f|", c));
}
}
