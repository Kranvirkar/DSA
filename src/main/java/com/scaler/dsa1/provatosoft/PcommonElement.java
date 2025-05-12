package com.scaler.dsa1.provatosoft;
/*

Write a java program to find common elements between the two given
arrays.
Suppose given two arrays array1= {1,4,7, 9, 2} arrray2 = {1,7,3,4,5} the
answer should be {1,4,7}

*/

import java.util.*;

public class PcommonElement {
    public static void main(String[] args) {
        Integer[] arr1={1,4,7, 9, 2};
        Integer[] arr2={1,7,3,4,5};
        System.out.println("first array "+Arrays.toString(arr1 )+" second array "+ Arrays.toString(arr2));
        commonElement(arr1,arr2);
    }

    private static void commonElement(Integer[] arr1, Integer[] arr2) {
        Integer n =arr1.length;
        Integer m =arr2.length;

        Set<Integer> set =new HashSet<>(Arrays.asList(arr2));

        List<Integer> list =new ArrayList<>();
        for (int tmp:arr2){
            if (set.contains(tmp)){
                list.add(tmp);
            }
        }
        System.out.println(list);
    }
}
