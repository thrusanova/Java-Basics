package com.company;

import java.util.Scanner;

/**
 * Created by tanya on 12/16/2015.
 */
public class TriangleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String [] firstPoint=console.nextLine().trim().split(" ");
        int ax=Integer.parseInt(firstPoint[0]);
        int ay=Integer.parseInt(firstPoint[1]);
        String [] secondPoint=console.nextLine().trim().split(" ");
        int bx=Integer.parseInt(secondPoint[0]);
        int by=Integer.parseInt(secondPoint[1]);
        String [] thirdPoint=console.nextLine().trim().split(" ");
        int cx=Integer.parseInt(thirdPoint[0]);
        int cy=Integer.parseInt(thirdPoint[1]);
        int area=Math.abs((ax*(by-cy)+bx*(cy-ay)+cx*(ay-by))/2);
        System.out.println(area);
    }

}
