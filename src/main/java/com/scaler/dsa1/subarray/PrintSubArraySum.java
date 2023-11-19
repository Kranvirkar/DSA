package com.scaler.dsa1.subarray;

public class PrintSubArraySum {

	/*
	Givven ar[N] print all sub arrays sum
	print Each in new line
	*/
	
	//Brute force TC:N^3
	public static void printsub(int[] arr) {
		int N=arr.length;
		for (int i = 0; i < N; i++) {
			for (int j = i; j < N; j++) {
				int sum =0;
				for (int j2 = i; j2 <=j; j2++) {
					sum+=arr[j2];
				}
				System.out.println(sum);
			}
		}
	}
	
	//optimized N^2
	public static void printsum(int[] arr) {
		int N=arr.length;
		int[] psum =new int[N];
		psum[0]=arr[0];
		for (int i = 1; i < N; i++) {
			psum[i] =psum[i-1]+arr[i];
		}
		
		for (int start = 0; start < N; start++) {
			for (int end = start; end < N; end++) {
				if (start==0) {
					System.out.println(psum[end]);
				}else {
					System.out.println(psum[end]-psum[start-1]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {2,8,-1,4};
		printsum(arr);
	}

}
