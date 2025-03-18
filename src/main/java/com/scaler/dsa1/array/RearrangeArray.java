package com.scaler.dsa1.array;

import java.util.Arrays;

public class RearrangeArray {
    public static void main(String[] args) {
        long arr[] = {1, 2, 3, 4, 5, 6};
        rearrange(arr, arr.length);
        System.out.println(Arrays.toString(arr)); // Output: [6, 1, 5, 2, 4, 3]
    }
    //Two Pointer (O(N) time, O(1) space)
    public static void rearrange(long arr[], int n) {
        long maxElement = arr[n - 1] + 1; // Store a number greater than the max element
        int maxIndex = n - 1, minIndex = 0;

        // Encoding the elements at correct positions
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                arr[i] += (arr[maxIndex] % maxElement) * maxElement;
                maxIndex--;
            } else {
                arr[i] += (arr[minIndex] % maxElement) * maxElement;
                minIndex++;
            }
        }

        // Extract new values by dividing with maxElement
        for (int i = 0; i < n; i++) {
            arr[i] /= maxElement;
        }
    }
    //(O(N) time, O(N) space)
    void rearrangespace(long arr[], int n) {
        long temp[] = new long[n];
        int left = 0, right = n - 1, index = 0;

        while (left <= right) {
            if (index % 2 == 0) {
                temp[index++] = arr[right--]; // Max element
            } else {
                temp[index++] = arr[left++]; // Min element
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i]; // Copy back to original
        }
    }
    //(O(N log N) time, O(1) space)
    void rearrangeEfficient(long arr[], int n) {
        Arrays.sort(arr); // Sort the array first
        for (int i = 1; i < n - 1; i += 2) {
            long temp = arr[i];
            arr[i] = arr[n - 1];
            arr[n - 1] = temp;
        }
    }

}
