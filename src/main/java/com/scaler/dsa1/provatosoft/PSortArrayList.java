package com.scaler.dsa1.provatosoft;

import java.util.*;
import java.util.stream.Collectors;

public class PSortArrayList {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Tesla", "Apple", "Google", "Amazon"));
        ///1.Using Collection.sort()
        System.out.println("Before sort: " + list);
        Collections.sort(list);
        System.out.println("After sort (Ascending): " + list);

        System.out.println("Before sort: " + list);
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println("After sort (Descending): " + list);

        //2.using list.sort()
        list.sort((s1,s2)->s1.compareToIgnoreCase(s2));
        System.out.println("Sorted list: " + list);

        //using StreamApi
        List<String> list1 = list.stream().sorted().toList();
        System.out.println("Sorted List using Streams: " +list1);
    }
}
