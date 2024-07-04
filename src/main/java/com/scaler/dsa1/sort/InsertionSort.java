package com.scaler.dsa1.sort;

public class InsertionSort {

	public static void insertionSort(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				} else {
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] array = {64, 34, 25, 12, 22, 11, 90};
		insertionSort(array);

        System.out.println("Sorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

	}

}
