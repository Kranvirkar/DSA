package com.scaler.dsa1.array;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {

        int arr[] = {10, 20, 20, 30, 30, 30};
        int n = arr.length;
        System.out.println("Before Removal");
            System.out.print(Arrays.toString(arr));


        System.out.println();

        n = remDups(arr, n);

        System.out.println("After Removal");

        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    private static int remDups(int[] arr, int n) {
        int res = 1;

        for(int i = 1; i < n; i++)
        {
            if(arr[res - 1] != arr[i])
            {
                arr[res] = arr[i];
                res++;
            }
        }

        return res;
    }
}
