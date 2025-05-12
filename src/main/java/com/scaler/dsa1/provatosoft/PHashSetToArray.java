package com.scaler.dsa1.provatosoft;

import java.util.Arrays;
import java.util.HashSet;

public class PHashSetToArray {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        //1.toArray
        String[] arr =set.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));

        //2.Stream
        String[] arr1 = set.toArray(String[]::new);
        System.out.println(Arrays.toString(arr1));
    }
}
