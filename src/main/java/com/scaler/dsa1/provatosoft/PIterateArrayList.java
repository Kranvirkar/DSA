package com.scaler.dsa1.provatosoft;


/*
Write a java program to iterate over ArrayList in java using for loop, for
each loop, While loop, Iterator and Collection's stream() util .

*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class PIterateArrayList {
    public static void main(String[] args) {
        ArrayList<String> companies = new ArrayList<>(Arrays.asList("Apple", "Amazon", "Google", "Tesla", "IBM"));

        System.out.println("Using for loop:");
        for (int i = 0; i < companies.size(); i++) {
            System.out.println(companies.get(i));
        }

        System.out.println("\nUsing enhanced for-each loop:");
        for (String company : companies) {
            System.out.println(company);
        }

        System.out.println("\nUsing while loop:");
        int i = 0;
        while (i < companies.size()) {
            System.out.println(companies.get(i));
            i++;
        }

        System.out.println("\nUsing Iterator:");
        Iterator<String> iterator = companies.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nUsing Java 8 Stream API:");
        companies.stream().forEach(System.out::println);
    }
}
