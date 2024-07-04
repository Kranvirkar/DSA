package com.scaler.dsa1.hashmap;

import java.util.HashMap;
import java.util.Iterator;

public class CountOccurrence {

	/*
	 * Given an array A. You have some integers given in the array B. For the i-th
	 * number, find the frequency of B[i] in the array A and return a list
	 * containing all the frequencies.
	 * 
	 * 
	 * Problem Constraints 1 <= |A| <= 105 1 <= |B| <= 105 1 <= A[i] <= 105 1 <=
	 * B[i] <= 105
	 * 
	 * 
	 * Input Format First argument A is an array of integers. Second argument B is
	 * an array of integers denoting the queries.
	 * 
	 * 
	 * Output Format Return an array of integers containing frequency of the each
	 * element in B.
	 * 
	 * 
	 * Example 
	 * Input Input 1: A = [1, 2, 1, 1] B = [1, 2] 
	 * Input 2: A = [2, 5, 9, 2,8] B = [3, 2]
	 * 
	 * 
	 * Example Output 
	 * Output 1: [3, 1] 
	 * Output 2: [0, 2]
	 * 
	 */
	
	public static int[] solve(int[] A, int[] B) {
        int N = A.length;
        int Q = B.length;
        HashMap<Integer,Integer>freq = new HashMap<>(); 
        for (int i=0; i<N;i++) {  
            if ( freq.containsKey(A[i]) ) {
                int val = freq.get(A[i]);
                freq.put(A[i],val+1);
            }
             else {
                freq.put(A[i],1);
            }
        }
        int ans[] = new int[Q];
         for (int i =0; i<Q;i++) {
             if ( freq.containsKey(B[i]) ) {
                 ans[i] = freq.get(B[i]);
             }
         } return ans;
	}

	public static HashMap<Integer, Integer> hashMap(int[] A) {
		HashMap<Integer, Integer> map=new HashMap<>();
		for (int i = 0; i < A.length; i++) {
			if (map.containsKey(A[i])) {
				map.put(A[i], map.get(A[i])+1);
			} else {
				map.put(A[i], 1);
			}
		}
		return map;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1, 2, 1, 1};
		int[] B = {1, 2};
		System.out.println(hashMap(A));
	}

}
