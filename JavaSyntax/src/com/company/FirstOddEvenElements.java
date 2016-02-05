package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.concurrent.SynchronousQueue;
import java.util.stream.Stream;

public class FirstOddEvenElements {
    public static void main (String arg[]){
        Scanner scn=new Scanner(System.in);
        String  str=scn.nextLine();
        String command=scn.nextLine();
        String [] input=str.split(" ");
        String [] comm=command.split(" ");
        int K=Integer.parseInt(comm[1]);
        String numStr=comm[2];
        int count=0;
        int [] arr=new int[input.length];
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        for (int i = 0; i < input.length; i++) {
            arr[i]=Integer.parseInt(input[i]);
        }
        if (numStr.equals("even")) {
            for (int n : arr) {//6
                if (n % 2 == 0) {
                    System.out.print(n+" ");
                    count++;
                    if (count>=K){
                        break;
                    }
                }
            }
        }
        else {
            for (int n : arr) {//6
                if (n % 2 ==1) {
                    System.out.print(n+" ");
                    count++;
                    if (count>=K){
                        break;
                    }
                }
            }
        }
    }
}

