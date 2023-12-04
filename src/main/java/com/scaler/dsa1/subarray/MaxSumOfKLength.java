package com.scaler.dsa1.subarray;

public class MaxSumOfKLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {-3,4,-2,5,3,-2,8,2,-1,4};
		System.out.println(printsub2(arr,5));
	}

	//brute force TC: O(N^2) SC: O(1)
	private static int printsub(int[] arr,int k) {
		int N=arr.length;
		int start =0,end=k-1;
		int ans=0;
		while (end < N) {
			int sum=0;
			for (int i = start; i<=end; i++) {
				sum+=arr[i];
			}
			start++;end++;
			ans =Math.max(ans, sum);
		}
		return ans;	
	}
	
	//optimized TC: O(N) SC: O(N)
		private static int printsub1(int[] arr,int k) {
			int ans=0;
			int psum[] = new int[arr.length];
			psum[0]=arr[0];
			for (int i = 1; i < psum.length; i++) {
				psum[i]=arr[i]+psum[i-1];
			}
			int start =0,end=k-1;
			while (end < arr.length) {
				int sum=0;
				if (start==0) {
					sum=psum[end];
				} else {
					sum=psum[end]-psum[start-1];
				}
				start++;end++;
				ans =Math.max(ans, sum);
			}
			return ans;	
		}
		
		//optimized TC: O(N) SC: O(1)
		private static int printsub2(int[] arr,int k) {
			int ans=0;
			int sum=0;
			for (int i = 0; i < k; i++) {
				sum+=arr[i];
			}
			ans =Math.max(ans, sum);
			int start =1,end=k;
			while (end < arr.length) {
				sum=sum-arr[start-1]+arr[end];
				start++;end++;
				ans =Math.max(ans, sum);
			}
			return ans;	
		}
	
}
