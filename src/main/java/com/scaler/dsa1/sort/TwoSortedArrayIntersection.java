package com.scaler.dsa1.sort;

import java.util.ArrayList;
import java.util.List;

public class TwoSortedArrayIntersection {
    public static List<Integer> findIntersection(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<>();
        int i=0,j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]==arr2[j]){
                if (list.isEmpty() || list.get(list.size()-1)!=arr1[i]){
                    list.add(arr1[i]);
                }
                i++;
                j++;
            } else if (arr1[i]<arr2[j]){
                i++;
            }else {
                j++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4, 5, 6};
        int[] arr2 = {2, 2, 3, 5, 7};
       // System.out.println(); // Output: [2, 3, 5]
        findIntersection(arr1, arr2).forEach(System.out::println);
        int[] arr3 = {1, 2, 3};
        int[] arr4 = {4, 5, 6};
        System.out.println(findIntersection(arr3, arr4)); // Output: []
    }
}
