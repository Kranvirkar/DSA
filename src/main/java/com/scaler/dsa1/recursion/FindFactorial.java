package com.scaler.dsa1.recursion;

public class FindFactorial {

	/*
	 * Write a program to find the factorial of the given number A using recursion.
	 * Note: The factorial of a number N is defined as the product of the numbers
	 * from 1 to N. Input 1: A = 4 Input 2: A = 1
	 * 
	 * Example Output Output 1: 24 Output 2: 1
	 */

	public static int solve(int A) {
		if (A == 1) {
			return 1;
		}
		return solve(A - 1) * A;
	}

	public static void main(String[] args) {
		System.out.println(solve(5));
	}

}
