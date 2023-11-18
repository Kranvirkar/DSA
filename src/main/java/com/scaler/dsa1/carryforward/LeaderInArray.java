package com.scaler.dsa1.carryforward;

public class LeaderInArray {

	/*
	 * Given an ar[N], you have to find No. of leaders in arr[] Note: arr[i] is said
	 * leader, :if it's greater than > max of all elements on left from [0,i-1]
	 * Note: arr[0] is considered as leader 
	 * Brute Force 
	 * TC: O(N) ,SC: O(1)
	 */
	
	public static int countleader(int[] arr) {
		int l=1, max=arr[0];
		for (int j = 1; j < arr.length; j++) {
			if (arr[j]>max) {
				max=arr[j];
				l=l+1;
			}
		}
		return l;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] i = {1,5,4,6,9,8,10};
		System.out.println(countleader(i));
	}

}
