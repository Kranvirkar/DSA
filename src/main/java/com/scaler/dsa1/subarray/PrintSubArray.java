package com.scaler.dsa1.subarray;

public class PrintSubArray {

	/*
	Givven ar[N] print all sub arrays 
	print Each in new line
	*/
	
	
	public static void printsub(int[] arr) {
		int N=arr.length;
		for (int s = 0; s < N; s++) {
			for (int e = s; e < N; e++) {
				
				for (int i = s; i <=e; i++) {
					System.out.print(arr[i]+" ");
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
