package com.company;

import javax.swing.*;
import java.util.HashMap;
import java.util.Scanner;

public class MagicExchangeableWords {
    public static void main (String args[]){
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        String [] input=str.split(" ");
        String first=input[0];
        String second=input[1];
        boolean res=false;
        HashMap<Character,Character>dict=new HashMap<>();
        for (int i = 0; i < first.length(); i++) {
           if (!dict.containsKey(first.charAt(i))){
               if (!dict.containsValue(second.charAt(i))) {
                   dict.put(first.charAt(i),second.charAt(i));
               }
           }
        }

        for (int i = 0; i < first.length(); i++) {
            if (dict.containsKey(first.charAt(i))) {
                if (dict.get(first.charAt(i)) != second.charAt(i)) {
                    res = false;
                } else {
                    res = true;
                }
            }
           else  {
                   res=false;
                }
            }
            System.out.print(res);
        }
    }

