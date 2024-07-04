package com.scaler.dsa1.sort;

import java.util.Arrays;
import java.util.Collections;

public class SortingUsingBuiltInmethods {

	public static void sort1() {
		int[] arr = {13, 7, 6, 45, 21, 9, 101, 102};

        Arrays.sort(arr);

        System.out.printf("Modified sort1() arr[] : %s",
                          Arrays.toString(arr));
	}
	
	
	public static void sortBetweenIndices() {
		// Our arr contains 8 elements
        int[] arr = {13, 7, 6, 45, 21, 9, 2, 100};

        // Sort subarray from index 1 to 4, i.e.,
        // only sort subarray {7, 6, 45, 21} and
        // keep other elements as it is.
        Arrays.sort(arr, 1, 5);

        System.out.printf("Modified sortBetweenIndices() arr[] : %s",
                          Arrays.toString(arr));
	}
	
	public static void sorDesc() {
		Integer[] arr = {13, 7, 6, 45, 21, 9, 2, 100};

        // Sorts arr[] in descending order
        Arrays.sort(arr, Collections.reverseOrder());

        System.out.printf("Modified sorDesc() arr[] : %s",
                          Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sort1();
		System.out.println();
		sortBetweenIndices();
		System.out.println();
		sorDesc();
		System.out.println();
		
	}

}
