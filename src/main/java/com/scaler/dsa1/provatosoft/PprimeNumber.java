package com.scaler.dsa1.provatosoft;
import java.util.Scanner;

public class PprimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a Prime number.");
        } else {
            System.out.println(number + " is NOT a Prime number.");
        }
    }

    private static boolean isPrime(int number) {
        if (number<=1) return false;
        if (number ==2 || number ==3 || number==5) return true;
        if (number %2==0 || number%3==0 || number%5==0) return false;
        for (int i = 7; i <Math.sqrt(number) ; i=+2) {
            if (number%i==0){
                return false;
            }
        }
        return true;
    }
}
