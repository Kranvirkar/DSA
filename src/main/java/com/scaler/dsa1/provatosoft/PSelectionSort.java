package com.scaler.dsa1.provatosoft;

public class PSelectionSort {
    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 13};

        System.out.println("Original Array:");
        printArray(arr);

        selectionSort(arr);

        System.out.println("Sorted Array using Selection Sort:");
        printArray(arr);
    }

    // Method to perform selection sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Move boundary of unsorted subarray one by one
        for (int i = 0; i < n - 1; i++) {
            // Assume the current element is the minimum
            int minIndex = i;

            // Find the actual minimum in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap if a new minimum is found
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Utility method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
