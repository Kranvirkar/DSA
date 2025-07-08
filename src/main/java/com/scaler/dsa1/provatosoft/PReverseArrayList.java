package com.scaler.dsa1.provatosoft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
Write a java program reverse an ArrayList in java?
ArrayList Before Reverse : [Apple, Amazon, Facebook, Google, IBM,
Tesla]
ArrayList After Reverse :[Tesla, IBM, Google, Facebook, Amazon, Apple]

*/
public class PReverseArrayList {
    public static void main(String[] args) {
        ArrayList<String> companies = new ArrayList<>(Arrays.asList("Apple", "Amazon", "Facebook", "Google", "IBM", "Tesla"));
        System.out.println("Before Reverse: " + companies);
        Collections.reverse(companies);
        System.out.println("After Reverse: " + companies);


        System.out.println("Before Reverse: " + companies);
        for (int i = 0, j = companies.size() - 1; i < j; i++, j--) {
            String temp = companies.get(i);
            companies.set(i, companies.get(j));
            companies.set(j, temp);
        }
        System.out.println("After Reverse: " + companies);


        System.out.println("Before Reverse: " + companies);
        ArrayList<String> reversed = new ArrayList<>();
        for (int i = companies.size() - 1; i >= 0; i--) {
            reversed.add(companies.get(i));
        }
        System.out.println("After Reverse: " + reversed);
    }
}
