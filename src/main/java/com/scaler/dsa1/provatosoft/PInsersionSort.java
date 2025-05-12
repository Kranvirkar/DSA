package com.scaler.dsa1.provatosoft;

public class PInsersionSort {
    public static void main(String[] args) {
        int[] arr = {9, 5, 1, 4, 3};

        System.out.println("Original Array:");
        printArray(arr);

        insertionSort(arr);

        System.out.println("Sorted Array using Insertion Sort:");
        printArray(arr);
    }

    // Method to perform insertion sort
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            // Move elements greater than current to one position ahead
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = current;
        }
    }

    // Utility method to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}