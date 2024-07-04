package com.scaler.dsa1.searching;

public class peakElement {

	public static int solve(int[] A) {
        int left = 0;
        int right = A.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (A[mid] > A[mid + 1]) {
                // The peak element is in the left half
                right = mid;
            } else {
                // The peak element is in the right half
                left = mid + 1;
            }
        }

        // At the end of the loop, 'left' and 'right' point to the peak element
        return A[left];
    }
	
	public static void main(String[] args) {
		int[] A= {5, 17, 100, 11};
		System.out.println(solve(A));
	}
}
