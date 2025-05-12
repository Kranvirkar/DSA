package com.scaler.dsa1.provatosoft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PArrayToArrayList {

    public static void main(String[] args) {
        //1.Using new ArrayList<>(Arrays.asList(array))
        String[] array = {"Apple", "Amazon", "Google"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(array)); // Resizable list
        System.out.println(list);

        //2.Manual
        ArrayList<String> list1 = new ArrayList<>();
        for(String item : array) {
            list1.add(item);
        }
        System.out.println("List using loop: " + list1);

        //3.Stream Api
        List<String> list2 = Arrays.stream(array).toList();
        System.out.println(list2);
    }
}
