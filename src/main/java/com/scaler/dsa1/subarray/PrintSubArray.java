package com.scaler.dsa1.subarray;

public class PrintSubArray {

	/*
	Givven ar[N] print all sub arrays 
	print Each in new line
	*/
	
	
	public static void printsub(int[] arr) {
		int N=arr.length;
		for (int i = 0; i < N; i++) {
			for (int j = i; j < N; j++) {
				
				for (int j2 = i; j2 <=j; j2++) {
					System.out.print(arr[j2]+" ");
				}
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {2,8,-1,4};
		printsub(arr);
	}

}
