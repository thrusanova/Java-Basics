package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartsEndsWithCapitalLetter {
    public  static void main(String []args){
        Scanner input=new Scanner(System.in);
        String str =input.nextLine();
        Pattern regex=Pattern.compile("\\b[A-Z][a-zA-Z]*[A-Z]");
        Matcher match=regex.matcher(str);
        while (match.find()){
            System.out.print(match.group()+ " ");
    }
    }
}
