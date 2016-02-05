package com.company;

import java.util.Scanner;

public class CharacterMultiplier2 {
    public static  void main (String args[]) {
        Scanner str=new Scanner(System.in);
        String [] input=str.nextLine().split(" ");
        String first=input[0];
        String second=input[1];
        int result=0;
        if (first.length()>second.length()){
            for (int i = 0; i < second.length(); i++) {
                for (int j = i; j < first.length(); j++) {
                    result += second.charAt(i) * first.charAt(j);
                    break;
                }
            }
            String newStr = first.substring(second.length(), first.length());
            for (int i = 0; i < newStr.length(); i++) {
                result+=newStr.charAt(i);
            }
        }

        else if (second.length()>first.length()) {
            for (int i = 0; i < first.length(); i++) {
                for (int j = i; j < second.length(); j++) {
                   result+=first.charAt(i) * second.charAt(j);
                    break;
                }
            }
            String newStr = second.substring(first.length(), second.length());
            for (int i = 0; i < newStr.length(); i++) {
                result+=newStr.charAt(i);
            }
        }
        else  if (first.length()==second.length()){
            for (int i = 0; i < first.length(); i++) {
                for (int j = i; j < second.length(); j++) {
                    result+=first.charAt(i)*second.charAt(j);
                    break;
                }

            }

        }
      System.out.println(result);
    }
}
