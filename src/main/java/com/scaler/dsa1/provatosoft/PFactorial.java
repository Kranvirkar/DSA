package com.scaler.dsa1.provatosoft;

import java.math.BigInteger;
import java.util.stream.LongStream;

public class PFactorial {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Factorial of " + number + " is " + factorial(number));
    }

    private static long factorial(int number) {
        long fact=1;
        for (int i = 2; i <=number ; i++) {
            fact *=i;
        }
        return  fact;
    }

    private static BigInteger factorial1(int number) {long fact=1;
        BigInteger big =BigInteger.ONE;
        for (int i = 2; i <=number; i++) {
            big=big.multiply(BigInteger.valueOf(i));
        }
        return big;
    }

    public static long factorial3(int n) {
        return LongStream.rangeClosed(1, n)
                .reduce(1, (a, b) -> a * b);
    }
}
