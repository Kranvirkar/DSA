package com.scaler.dsa1.array;

import java.util.Arrays;

public class findTripletWithZeroSum {
    public static boolean findTripletWithZeroSum(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);  // Sort the array

        // Traverse the array
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            // Use two pointers to find the other two elements
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {
                    return true;  // Triplet found
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return false;  // No triplet found
    }

    public static void main(String[] args) {


        int[] arr1 = {0, -1, 2, -3, 1};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {-5, 3, 2, -1, 0, 1};

        System.out.println(findTripletWithZeroSum(arr1)); // Output: true
        System.out.println(findTripletWithZeroSum(arr2)); // Output: false
        System.out.println(findTripletWithZeroSum(arr3)); // Output: true
    }
}
