package com.scaler.dsa1.hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SubarraySumEqualsK {

	/*
	 * Given an array of integers A and an integer B. Find the total number of
	 * subarrays having sum equals to B.
	 * 
	 * Input 1: A = [1, 0, 1] B = 1
	   Input 2: A = [0, 0, 0] B = 0

		Example Output
		Output 1: 4
		Output 2:6
	 * 
	 */
	
	public static int solve(int[] A, int B) {
        int count = 0;
        int sum = 0;
        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();

        // Initialize the prefix sum with 0, as an empty subarray has a sum of 0.
        prefixSumCount.put(0, 1);

        // Loop through the array to calculate the prefix sum and count occurrences.
        for (int i = 0; i < A.length; i++) {
            sum += A[i];

            // Check if there is a prefix sum (sum - B) in the hash map.
            // If yes, add the count to the result.
            if (prefixSumCount.containsKey(sum - B)) {
                count += prefixSumCount.get(sum - B);
            }

            // Update the count of the current prefix sum in the hash map.
            prefixSumCount.put(sum, prefixSumCount.getOrDefault(sum, 0) + 1);
        }

        return count;

    }

    private static boolean solve1(int[] a,int k) {
        int N=a.length;
        int sum=0;
        Set<Integer> hs =new HashSet<>();

        for (int i = 0; i < N; i++) {
            sum+=a[i];
            if ((a[i] == k
                    || sum == k
                    || hs.contains(sum-k))){
                return true;
            }else {
                hs.add(sum);
            }
        }
        return false;
    }
	public static void main(String[] args) {
		int[] A= {0,0,0};
		System.out.println(solve(A, 0));
        int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int n = arr.length;
        int sum = 23;
        System.out.println(solve1(arr, sum));
	}

}
