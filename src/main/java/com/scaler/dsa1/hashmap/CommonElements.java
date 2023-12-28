package com.scaler.dsa1.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonElements {

	/*
	 * Given two integer arrays, A and B of size N and M, respectively. Your task is
	 * to find all the common elements in both the array.
	 * 
	 * NOTE:
	 * 
	 * Each element in the result should appear as many times as it appears in both
	 * arrays. The result can be in any order.
	 * 
	 * Input 1:A = [1, 2, 2, 1] B = [2, 3, 1, 2]
	   Input 2: A = [2, 1, 4, 10] B = [3, 6, 2, 10, 10]
	  Example Output
      Output 1: [1, 2, 2]
      Output 2: [2, 10]
      
	 */

	public static int[] solve(int[] A, int[] B) {
		List<Integer> result = new ArrayList<>();
		Map<Integer, Integer> frequencyMap = new HashMap<>();

		// Count frequencies in array A
		for (int num : A) {
			frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
		}

		// Count frequencies in array B and add common elements to the result list
		for (int num : B) {
			if (frequencyMap.containsKey(num) && frequencyMap.get(num) > 0) {
				result.add(num);
				frequencyMap.put(num, frequencyMap.get(num) - 1);
			}
		}

		// Convert the result list to an array
		int[] resultArray = new int[result.size()];
		for (int i = 0; i < result.size(); i++) {
			resultArray[i] = result.get(i);
		}

		return resultArray;
	}

	public static void main(String[] args) {
		int[] A = {1, 2, 2, 1};
		int[] B = {2, 3, 1, 2};
		System.out.println(Arrays.toString(solve(A, B)));

	}

}
