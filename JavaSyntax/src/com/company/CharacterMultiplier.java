package com.company;

import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Created by tanya on 12/18/2015.
 */
public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
    //    String input=console.nextLine();
        String firstStr=console.next();
        String secondStr=console.next();
        int result=multiplyStr(firstStr,secondStr);
        System.out.println(result);

    }
    public static int multiplyStr(String first,String second){
        int sum=0;
        for (int i = 0; i < first.length(); i++) {
            sum+=first.charAt(i)*second.charAt(i);
        }
        sum+=reminderStr(first,second);
        return  sum;
    }

    public static int reminderStr(String first, String second){
        int reminderSum=0;
        if (first.length()>second.length()){
            String reminder=first.substring(second.length());
            for (int i = 0; i < reminder.length(); i++) {
               reminderSum+=reminder.charAt(i);
            }
        }
        else if(first.length()<second.length()){
            String reminder=second.substring(first.length());
            for (int i = 0; i < second.length(); i++) {
                reminderSum+=reminder.charAt(i);
            }
        }
        return reminderSum;
    }
}

