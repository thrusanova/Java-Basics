package com.company;

import java.util.Scanner;

public class CalculateExpression {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        float a = new Float(console.nextLine());
        float b = new Float(console.nextLine());
        float c = new Float(console.nextLine());
        float f1 = (float) (Math.pow(((a * a + b * b) / (a * a - b * b)), ((a + b + c) / Math.sqrt(c))));
        float f2 = (float) (Math.pow((a * a + b * b - c * c * c), (a - b)));
        float averageNum = (a + b + c) / 3;
        float averageFunc = (f1 + f2) / 2;
        float result=Math.abs(averageFunc-averageNum);
        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %2f;",f1,f2,result);

    }

}
