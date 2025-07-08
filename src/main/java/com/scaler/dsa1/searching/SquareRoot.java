package com.scaler.dsa1.searching;

public class SquareRoot {

	public static void main(String[] args) {
		System.out.println(solve(25));

	}

	private static int solve(int k) {
		int low = 1, high = k, ans = -1;
		while (low <= high) {
			int mid = low+(high-low) / 2;
			//int msqr = mid * mid;
			if (mid == k/mid) {
				return mid;
			} else if (mid > k/mid) {
				high = mid - 1;
			} else {
				low = mid + 1;
				ans = mid;
			}
		}
		return ans;
	}

}
