package com.scaler.dsa1.provatosoft;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PHashSetToList {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        //1.Using Constructor
        List<String> list =new ArrayList<>(set);
        System.out.println(list);

        //2.Using Add
        List<String> list1 =new ArrayList<>();
        list1.addAll(set);
        System.out.println(list1);

        //3.Using for loop
        List<String> list2 =new ArrayList<>();
        for (String temp: set) {
            list2.add(temp);
        }
        System.out.println(list2);

        //4 using Stream api
        List<String> list3 =set.stream().toList();
        System.out.println(list3);
    }
}
