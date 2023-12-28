package com.scaler.dsa1.bitwise;

public class UniqueElement {

	/*
	Given an array of integers A, every element appears twice except for one. Find that integer that occurs once.
	Input 1:

 	A = [1, 2, 2, 3, 1]
	Input 2:

 	A = [1, 2, 2]

	Example Output
	Output 1:

 	3
	Output 2:

 	1
	*/
	
	public static int singleNumber(final int[] A) {
		int result=0;
		for (int i = 0; i < A.length; i++) {
			result ^=A[i];
		}
		return result;
	}
	public static void main(String[] args) {
		int[] A = {1, 2, 2, 3, 1};
		System.out.println(singleNumber(A));
	}

}
