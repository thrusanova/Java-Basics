package com.company;

import java.util.Scanner;

public class illyminATI {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        long result= 0;
        int countA = 0;
        int countI = 0;
        int countO = 0;
        int countE = 0;
        int countU = 0;

        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'A':
                case 'a':
                    countA++;
                    result += 65;
                    break;
                case 'I':
                case 'i':
                    countI++;
                    result += 73;
                    break;
                case 'O':
                case 'o':
                    countO++;
                    result += 79;
                    break;
                case 'E':
                case 'e':
                    countE++;
                    result += 69;
                    break;
                case 'U':
                case 'u':
                    countU++;
                    result += 85;
                    break;
            }
        }
        int allCounts = countA + countE + countI + countO + countU;
       System.out.println(allCounts);
       System.out.println(result);
    }
    }

