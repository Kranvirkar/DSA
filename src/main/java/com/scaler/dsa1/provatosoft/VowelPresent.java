package com.scaler.dsa1.provatosoft;

public class VowelPresent {

    public static void main(String[] args) {
        /*
        Write a Java program to check if a vowel is present in a string
        */
        String str ="GeekForGeeks";
        System.out.println("Vowel Present "+isVowelPresent(str));
    }

    private static boolean isVowelPresent(String str) {
        return str.toLowerCase().matches(".*[aeiou].*");
    }
}
