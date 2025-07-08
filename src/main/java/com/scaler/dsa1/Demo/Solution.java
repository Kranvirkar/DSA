package com.scaler.dsa1.Demo;

import java.util.Arrays;

public class Solution {
    public int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        if (n == 1) return 0;  // Only one tower, no height difference

        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Initialize the difference as the difference between the max and min values of the sorted array
        int minDifference = arr[n - 1] - arr[0];

        // Step 3: Consider each tower's height adjustment and calculate the minimum possible difference
        int smallest = arr[0] + k;
        int largest = arr[n - 1] - k;

        for (int i = 0; i < n - 1; i++) {
            int minHeight = Math.min(smallest, arr[i + 1] - k);
            int maxHeight = Math.max(largest, arr[i] + k);

            minDifference = Math.min(minDifference, maxHeight - minHeight);
        }

        return minDifference;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        int[] arr1 = {1, 5, 8, 10};
        System.out.println(solution.getMinDiff(arr1, 2));  // Output: 5

        int[] arr2 = {3, 9, 12, 16, 20};
        System.out.println(solution.getMinDiff(arr2, 3));  // Output: 11
    }
}
