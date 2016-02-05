package com.company;

import java.util.Scanner;

public class ConvertFromSeven {
    public static  void main(String[]args){
        Scanner input=new Scanner(System.in);
        String str=new String(input.nextLine());
        Integer number=Integer.valueOf(str,7);
        System.out.println(number);
    }
}
