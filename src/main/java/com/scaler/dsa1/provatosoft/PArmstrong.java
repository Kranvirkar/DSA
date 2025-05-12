package com.scaler.dsa1.provatosoft;
import java.util.Scanner;

/*
Write a java program for the Armstrong number .

*/

public class PArmstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is NOT an Armstrong number.");
        }
    }

    private static boolean isArmstrong(int num) {
        int n= String.valueOf(num).length(),sum=0,original=num;
        while (num>0){
            int temp=num%10;
            sum+=Math.pow(temp,n);

            num/=10;
        }
        return original==sum;
    }
}
