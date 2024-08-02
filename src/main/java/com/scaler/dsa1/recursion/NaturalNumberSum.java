package com.scaler.dsa1.recursion;

public class NaturalNumberSum {
    public static void main(String[] args) {
        System.out.println(sumAllNaturalNumber(5));
    }

    /*
    Time complexity : O(n)
    Auxiliary space : O(n)
    */
    public static int sumAllNaturalNumber(int n){
        if (n<=1) {
            return 1;
        }
        return n+sumAllNaturalNumber(n-1);
    }
}
