package com.scaler.dsa1.array;

import java.util.Arrays;

public class MissingAndDuplicateValue {
        public static int[] findErrorNums(int[] arr) {
            int n = arr.length;
            int repeatingNumber = -1, missingNumber = -1;

            // Mark elements as visited
            for (int i = 0; i < n; i++) {
                int index = Math.abs(arr[i]) - 1;

                // If already negative, it's the repeating element
                if (arr[index] < 0) {
                    repeatingNumber = Math.abs(arr[i]);
                } else {
                    // Mark the element at index as visited
                    arr[index] = -arr[index];
                }
            }

            // Identify the missing number
            for (int i = 0; i < n; i++) {
                if (arr[i] > 0) { // The index + 1 is the missing number
                    missingNumber = i + 1;
                    break;
                }
            }

            return new int[] {repeatingNumber, missingNumber};
        }

        public static void main(String[] args) {

            // Test cases
            int[] arr1 = {2, 2};
            System.out.println(Arrays.toString(findErrorNums(arr1))); // Output: [2, 1]

            int[] arr2 = {1, 3, 3};
            System.out.println(Arrays.toString(findErrorNums(arr2))); // Output: [3, 2]

            int[] arr3 = {4, 3, 6, 2, 1, 1};
            System.out.println(Arrays.toString(findErrorNums(arr3))); // Output: [1, 5]
        }
}
