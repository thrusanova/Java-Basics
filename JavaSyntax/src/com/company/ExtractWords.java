package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractWords {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher m = pattern.matcher(input);
        while (m.find()) {
            System.out.print(m.group()+" ");
        }
    }
}