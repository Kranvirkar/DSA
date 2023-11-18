package com.scaler.dsa1.carryforward;

public class SpecialSubsequences {

	/*
	 * You have given a string A having Uppercase English letters. You have to find
	 * the number of pairs (i, j) such that A[i] = 'A', A[j] = 'G' and i < j.
	 * 
	 * Input 1: A = "ABCGAG" 
	 * Input 2: A = "GAB"
	 *  Example Output 
	 *  Output 1: 
	 *  3 
	 *  Output 2:
	 *  0
	 */

	public static long solve(String A) {
		int n = A.length();
		long ca = 0, ans = 0;
		for (int i = 0; i < n; i++) {
			if (A.charAt(i) == 'A') {
				ca++;
			} else if (A.charAt(i) == 'G') {
				ans += ca;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		String s1="ABCGAG";
		String s2 ="GAB";
		System.out.println(solve(s1));
		System.out.println(solve(s2));

	}

}
