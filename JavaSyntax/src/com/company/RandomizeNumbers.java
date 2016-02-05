package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by tanya on 12/17/2015.
 */
public class RandomizeNumbers {
    public  static  void main (String [] args) {
        Scanner console = new Scanner(System.in);
        int m = Integer.parseInt(console.nextLine());
        int n = Integer.parseInt(console.nextLine());
        Random random=new Random();
        ArrayList<Integer>list=new ArrayList<Integer>();
        if (m>n){
            while (list.size()!=n-m+1) {
                int randomNumber = n + random.nextInt((m - n) + 1);
                if (!list.contains(randomNumber)) {
                    list.add(randomNumber);
                    System.out.print(randomNumber + " ");
                }
            }
        }
        if (m<n) {
            while (list.size() != n - m + 1) {
                int randomNumber = m + random.nextInt((n - m) + 1);
                if (!list.contains(randomNumber)) {
                    list.add(randomNumber);
                    System.out.print(randomNumber + " ");
                }
            }
        }
            else{
            System.out.print(m);
        }
            System.out.println();
        }
    }

