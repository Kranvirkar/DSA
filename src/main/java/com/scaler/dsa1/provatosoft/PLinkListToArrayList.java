package com.scaler.dsa1.provatosoft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class PLinkListToArrayList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("Apple", "Amazon", "Google"));

        //1.using ArrayList constructor
        ArrayList<String> list=new ArrayList<>(linkedList);
        System.out.println(list);

        //2.using for loop
        ArrayList<String> list1=new ArrayList<>();
        for (String temp:linkedList){
            list1.add(temp);
        }
        System.out.println(list1);

        //3.Bulk add
        ArrayList<String> list2=new ArrayList<>();
        list2.addAll(linkedList);
        System.out.println(list2);

        //4.Stream Api
        ArrayList<String> list3=new ArrayList<>();
        list3=linkedList.stream()
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(list3);
    }
}
