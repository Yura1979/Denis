package com.ytsyutsyak;

import java.util.Scanner;

public class School {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        int x1 = 0;
        int x2 = 0;

        System.out.println("enter 3 values of formula - ax^2 + bx + c = 0");

        System.out.print("Enter variable a = ");
        a = scanner.nextInt();
        System.out.println();
        System.out.print("Enter variable b = ");
        b = scanner.nextInt();
        System.out.println();
        System.out.print("Enter variable c = ");
        c = scanner.nextInt();
        System.out.println();
        System.out.printf("You have entered %dx^2 + %dx + %d = 0\n", a, b, c);
        calculateFormula(a, b, c);
    }
    public static void calculateFormula(int a, int b, int c){
        int d;
        
        d = (b*b) - (4*a*c);
        System.out.println("d = " + d);
        if (d == 0) {
            System.out.println((-b+Math.sqrt(d))/(2*a));
        } else if (d > 0) {
            System.out.println((-b+Math.sqrt(d))/(2*a) + " " + (-b-Math.sqrt(d))/(2*a));
        } else {
            System.out.println("no roots");
        }
    }
}
