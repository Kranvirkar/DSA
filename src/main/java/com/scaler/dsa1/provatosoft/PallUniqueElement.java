package com.scaler.dsa1.provatosoft;
/*

Write a java program to find out if the given String has all Unique
Characters.

*/

import java.util.HashSet;
import java.util.Set;

public class PallUniqueElement {
    public static void main(String[] args) {
        String input = "hello";
        System.out.println("All characters unique? " + hasAllUniqueChars(input));
    }

    private static boolean hasAllUniqueChars(String input) {
        Set<Character> set =new HashSet<>();
        for (Character ch :input.toCharArray()){
            if (!set.add(ch)){
                return false;
            }
        }
        return true;
    }
}
