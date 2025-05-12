package com.scaler.dsa1.provatosoft;

import java.util.Scanner;

public class PFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number ");
        int number =sc.nextInt();
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        int a=0,b=1;
        System.out.print(a+" "+b);
        for (int i = 2; i <number ; i++) {
        int c =a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }

    }
}
