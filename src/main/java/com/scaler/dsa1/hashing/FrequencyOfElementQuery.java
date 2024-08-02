package com.scaler.dsa1.hashing;

import java.util.Arrays;
import java.util.HashMap;

public class FrequencyOfElementQuery {

	/*
	 * Given an array A. You have some integers given in the array B. For the i-th
	 * number, find the frequency of B[i] in the array A and return a list
	 * containing all the frequencies. Input 1: A = [1, 2, 1, 1] B = [1, 2]
	 * 
	 * Input 2: A = [2, 5, 9, 2, 8] B = [3, 2]
	 * 
	 * Example Output Output 1: [3, 1] Output 2: [0, 2]
	 * 
	 */

	public static int[] solve(int[] A, int[] B) {
		int N = A.length;
		int M = B.length;
		int[] ans = new int[M];
		HashMap<Integer, Integer> hs = new HashMap<>();
		for (int i = 0; i < N; i++) {
			if (hs.containsKey(A[i])) {
				hs.put(A[i], hs.get(A[i]) + 1);
			} else {
				hs.put(A[i], 1);
			}
		}
		for (int i = 0; i < ans.length; i++) {
			if (hs.containsKey(B[i])) {
				ans[i] = hs.get(B[i]);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] A = { 1, 2, 1, 1 };
		int[] B = { 1, 2 };
		System.out.println(Arrays.toString(solve(A, B)));
	}
}
