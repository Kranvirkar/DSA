package com.scaler.dsa1.recursion;

public class SumOfDigits {

	/*
	 * Given a number A, we need to find the sum of its digits using recursion.
	 * Input 1: A = 46 Input 2: A = 11 Example Output Output 1: 10 Output 2: 2
	 * 
	 */
	public static int solve(int A) {
		if (A == 0) {
			return 0;
		}
		return solve(A / 10) + A % 10;
	}

	public static void main(String[] args) {
		System.out.println(solve(10));

	}

}
