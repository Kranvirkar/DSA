package com.scaler.dsa1.provatosoft;

import java.util.Arrays;

/*

Write a java program reverse an int Array in java?
Input : {3, 8, 5, 7, 4}
Output : {4, 7, 5, 8, 3}
Input : {10, 54, 23, 89, 97, 2}
Output : {2, 97, 89, 23, 54, 10}

*/

public class PReverseArray {


    public static void main(String[] args) {
        int[] arr1 = {3, 8, 5, 7, 4};
        int[] arr2 = {10, 54, 23, 89, 97, 2};

        System.out.println("Original Array 1:" + Arrays.toString(arr1));
        reverseArray(arr1);
        System.out.println("Reversed Array 1:"+Arrays.toString(arr1));


        System.out.println("Original Array 2:"+Arrays.toString(arr2));
        reverseArray(arr2);
        System.out.println("Reversed Array 2:"+Arrays.toString(arr2));

    }

    private static void reverseArray(int[] arr) {
        int start=0,end=arr.length-1;
        while (start<end){
            int temp =arr[start];
            arr[start]=arr[end];
            arr[end] =temp;

            start++;
            end--;
        }
    }
}
