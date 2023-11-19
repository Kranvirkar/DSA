package com.scaler.dsa1.subarray;

public class MaxsubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,8,-1,4};
		System.out.println(printsub(arr));
	}

	private static int printsub(int[] arr) {
		int N=arr.length;
		int ans =0;
		for (int start = 0; start < N; start++) {
			int sum =0;
			for (int end = start; end < N; end++) {
				sum+=arr[end];
			}
			ans =Math.max(ans, sum);
		}
		return ans;
		
	}

}
