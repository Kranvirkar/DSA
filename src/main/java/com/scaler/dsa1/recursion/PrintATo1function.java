package com.scaler.dsa1.recursion;

public class PrintATo1function {

	/*
	 * You are given an integer A, print A to 1 using using recursion.
	 * 
	 * Note :- After printing all the numbers from A to 1, print a new line.
	 * 
	 * Input 1: 10 Input 2: 5
	 * 
	 * Example Output Output 1: 10 9 8 7 6 5 4 3 2 1 Output 2: 5 4 3 2 1
	 * 
	 */
	public static void solve(int A) {
		if (A == 1) {
			System.out.println(1 + " ");
			return;
		}
		System.out.print(A + " ");
		solve(A - 1);
	}

	public static void main(String[] args) {
		solve(10);

	}

}
