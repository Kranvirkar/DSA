package com.scaler.dsa1.sort;

import java.util.ArrayList;
import java.util.List;

public class UnionOfTwoSortedArray {

    public static List<Integer> findUnion(int[] arr1, int[] arr2) {
        List<Integer> list =new ArrayList<>();
        int i=0,j=0;
        while(i<arr1.length && j<arr2.length){
            if (arr1[i] < arr2[j]) {
            if (list.isEmpty() || list.get(list.size()-1)!=arr1[i]) {
                list.add(arr1[i]);
                }
            i++;
            } else if (arr1[i] > arr2[j]) {
                if (list.isEmpty() || list.get(list.size()-1)!=arr2[j]) {
                    list.add(arr2[j]);
                }
                j++;
            }else {
                if (list.isEmpty() || list.get(list.size()-1)!=arr1[i]) {
                    list.add(arr1[i]);
                }
                i++;
            }
        }
        while (i<arr1.length){
            if (list.isEmpty() || list.get(list.size()-1)!=arr1[i]) {
                list.add(arr1[i]);
            }
            i++;
        }
        while (j<arr2.length){
                if (list.isEmpty() || list.get(list.size()-1)!=arr2[j]) {
                    list.add(arr2[j]);
                }
                j++;
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4, 5, 6};
        int[] arr2 = {2, 2, 3, 5, 7};
        System.out.println(findUnion(arr1, arr2)); // Output: [1, 2, 3, 4, 5, 6, 7]

        int[] arr3 = {1, 3, 5};
        int[] arr4 = {2, 4, 6};
        System.out.println(findUnion(arr3, arr4)); // Output: [1, 2, 3, 4, 5, 6]
    }
}
