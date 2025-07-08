package com.scaler.dsa1.array;

import java.util.Arrays;

public class SmallestPositiveNumber {

    // (O(N log N) time, O(1) space)
    static int  findMissingNumber(int arr[], int n) {
        Arrays.sort(arr);
        int smallest = 1; // We are looking for the smallest positive integer starting from 1

        for (int num : arr) {
            if (num == smallest) {
                smallest++;
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int arr[] = {2, -3, 4, 1, 1, 7};
        System.out.println(findMissingNumber(arr,arr.length));
    }
}
