package com.scaler.dsa1.provatosoft;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class PArrayToTreeSet {
    public static void main(String[] args) {
        //1.Using Arrays.aslist()
        String[] arr = {"Banana", "Apple", "Orange"};
        TreeSet<String> tset =new TreeSet<>(Arrays.asList(arr));

        System.out.println(tset);

        //2.using for loop
        TreeSet<String> tset1 =new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            tset1.add(arr[i]);
        }
        System.out.println(tset1);

        //3.Using collections.add()
        TreeSet<String> tset2=new TreeSet<>();
        Collections.addAll(tset2,arr);
        System.out.println(tset2);
    }
}
