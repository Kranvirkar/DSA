package com.scaler.dsa1.sort;

import java.util.Arrays;

public class MergeSortedArraysGeeksForGeeks {

    // Function to merge two sorted arrays without using extra space
    public static void mergeArrays(int[] arr1, int n, int[] arr2, int m) {
    	int i = 0;
        int temp = 0;
  
         // While loop till last element
         // of array 1(sorted)
         // is greater than first element
         // of array 2(sorted)
         while (arr1[n - 1] > arr2[0]) {
             if (arr1[i] > arr2[0]) {
  
                 // Swap arr1[i] with first element
                 // of arr2 and sorting the updated
                 // arr2(arr1 is already sorted)
                 // swap(arr1[i],arr2[0]);
                 temp = arr1[i];
                 arr1[i] = arr2[0];
                 arr2[0] = temp;
                 Arrays.sort(arr2);
             }
             i++;
             }
         }

    // Main method to test the mergeArrays function
    public static void main(String[] args) {
        int n = 4;
        int[] arr1 = {1, 3, 5, 7};

        int m = 5;
        int[] arr2 = {0, 2, 6, 8, 9};

        // Call the mergeArrays function
        mergeArrays(arr1, n, arr2, m);

        // Print the modified arrays
        System.out.print("arr1[] = ");
        for (int value : arr1) {
            System.out.print(value + " ");
        }

        System.out.println();

        System.out.print("arr2[] = ");
        for (int value : arr2) {
            System.out.print(value + " ");
        }
    }
}

