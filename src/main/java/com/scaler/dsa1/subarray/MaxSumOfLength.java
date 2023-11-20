package com.scaler.dsa1.subarray;

public class MaxSumOfLength {

	/*
		Given an arr[N] elements return max of subarray sum of len=k
	*/	
	
	public static long maxSum(int[] arr,int k) {
		int N=arr.length;
		int s=0,e=k-1;
		int ans=Integer.MIN_VALUE;
		while (e<N) {
			int sum=0;
			for (int i = s; i <=e; i++) {
				sum+=arr[i];
			}
			s++;e++;
			ans=Math.max(ans, sum);
		}
		return ans;
	}
	
	public static long maxSum1(int[] arr,int k) {
		int N=arr.length;
		int[] psum=new int[N];
		psum[0]=arr[0];
		for (int i = 1; i < psum.length; i++) {
			psum[i]=psum[i-1]+arr[i];
		}
		int s=0,e=k-1;
		int ans=Integer.MIN_VALUE;
		while (e<N) {
			int sum=0;
			if (s==0) {
				sum =psum[e];
			}else {
				sum=psum[e]-psum[s-1];
			}
			s++;e++;
			ans=Math.max(ans, sum);
		}
		return ans;
	}
	

	//sliding window

	public static long maxSum2(int[] arr,int k) {
		int N=arr.length;
		int ans=Integer.MIN_VALUE;
		int sum=0;
		for (int i = 0; i < k; i++) {
			sum+=arr[i];
		}
		ans=Math.max(ans, sum);
		int s=1,e=k;
		
		while (e<N) {
			sum=sum-arr[s-1]+arr[e];
					
			s++;e++;
			ans=Math.max(ans, sum);
		}
		return ans;
	}
	
	
	public static void main(String[] args) {
		int[] arr= {-3,4,-2,5,3,-2,8,2,-1,4};
		System.out.println(maxSum2(arr, 5));

	}

}
