package com.scaler.dsa1.hashmap;

import java.util.HashMap;
import java.util.Map;

public class CountUniqueElements {

	/*
	 * You are given an array A of N integers. Return the count of elements with
	 * frequncy 1 in the given array.
	 * 
	 * Input 1: A = [3, 4, 3, 6, 6] Input 2: A = [3, 3, 3, 9, 0, 1, 0]
	 * 
	 * Example Output Output 1: 1 Output 2: 2
	 * 
	 * 
	 */

	public static int solve(int[] A) {
		Map<Integer, Integer> frequencyMap = new HashMap<>();
		int count = 0;

		for (int num : A) {
			int frequency = frequencyMap.getOrDefault(num, 0);
			frequencyMap.put(num, frequency + 1);

			if (frequency == 0) {
				count++; // Increment count if frequency was 0 (first occurrence)
			} else if (frequency == 1) {
				count--; // Decrement count if frequency was 1 (second occurrence)
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] A = { 3, 3, 3, 9, 0, 1, 0 };
		System.out.println(solve(A));

	}

}
