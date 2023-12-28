package com.scaler.dsa1.subarray;

public class SumOfAllSubArray {

	//brute force
	private static int printsub(int[] arr) {
		int N = arr.length;
		int total = 0;
		for (int start = 0; start < N; start++) {
			int sum = 0;
			for (int end = start; end < N; end++) {
				sum += arr[end];
				total = total+ sum;
			}
			
		}
		return total;

	}

	

	//optimized
	private static int printsub1(int[] arr) {
		int N = arr.length;
		int total = 0;
		for (int start = 0; start < N; start++) {
			//FORMULA: (i+1)*(N-i)
			int freq=(start+1)*(N-start);
			int value=freq * arr[start];
				total = total+value;
		}
		return total;

	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3,4,2};
		System.out.println(printsub1(arr));
	}

}
