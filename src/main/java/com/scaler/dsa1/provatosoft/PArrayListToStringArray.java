package com.scaler.dsa1.provatosoft;

import java.util.ArrayList;
import java.util.Arrays;

public class PArrayListToStringArray {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Apple", "Amazon", "Google"));

        //1.Using toArray(new String[0])
        String[] arr =list.toArray(new String[0]);
        System.out.println("Converted Array: " + Arrays.toString(arr));


        //2. Using toArray(new String[list.size()])
        String[] array = list.toArray(new String[list.size()]);
        System.out.println("Converted Array: " + Arrays.toString(array));

        //3.Stream Api
        String[] array1 = list.stream().toArray(String[]::new);
        System.out.println("Converted Array using Stream: " + Arrays.toString(array1));

        //4.Manual
        String[] array2 = new String[list.size()];

        for (int i = 0; i < list.size(); i++) {
            array2[i] = list.get(i);
        }

        System.out.println("Converted Array: " + Arrays.toString(array2));
    }
}
