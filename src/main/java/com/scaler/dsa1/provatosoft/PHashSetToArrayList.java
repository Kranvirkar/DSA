package com.scaler.dsa1.provatosoft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class PHashSetToArrayList {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>(Arrays.asList("Apple", "Amazon", "Google"));

        //1.using constructor
        ArrayList<String> list =new ArrayList<>(hashSet);
        System.out.println(list);

        //2. using addAll()
        ArrayList<String> list1 =new ArrayList<>();
        list1.addAll(hashSet);
        System.out.println(list1);

        //3. using foreach Loop
        ArrayList<String> list2 =new ArrayList<>();
        for (String temp :hashSet){
            list2.add(temp);
        }
        System.out.println(list2);

        //4. using Stream Api
        ArrayList<String> list3 =new ArrayList<>();
        list3 =hashSet.stream().collect(Collectors.toCollection(ArrayList::new));
        System.out.println(list3);
    }
}
