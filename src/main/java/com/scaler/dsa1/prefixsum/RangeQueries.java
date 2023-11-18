package com.scaler.dsa1.prefixsum;

public class RangeQueries {

	/*
	Give arr[N] elements and  mat[Q][2], Each row in mat[][] is query ith querty:
	mat[i][0] to mat[i][1] for every query calculate sum of all index element in ar[]
	from mat[i][0] ... mat[i][1]
	Note : store all query sums in ans[] and return ans[] 
	
	*/	
	
	//brute force TC : O(N^2) SC:O(1)
	public static long[] RangeSum(int arr[],int mat[][]) {
		int N=mat.length;
		long ans[]= new long[N];
		for (int i = 0; i <N; i++) {
			int sum=0;
			int start=mat[i][0],end=mat[i][1];
			for (int j = start; j <= end; j++) {
				sum+=arr[j];
			}
			ans[i]=sum; 
		}
		
		return ans;
	} 
	
	 //optimised  TC : O(N) SC:O(1)
		public static long[] RangeSum1(int arr[],int mat[][]) {
			int N=mat.length;
			int plength=arr.length;
			int[] psum=new int[plength];
			psum[0]=arr[0];
			for (int i = 1; i < plength; i++) {
				psum[i]=psum[i-1]+arr[i];
			}
			long ans[]= new long[N];
			for (int i = 0; i <N; i++) {
				int start=mat[i][0],end=mat[i][1];
				if (start==0) {
					ans[i]=psum[end];
				} else {
					ans[i]=psum[end]- psum[start-1];
				}	
			}
			return ans;
		} 
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-3,6,2,4,5,2,8,-9,3,1};
		int mat[][] = {
				{4,8},{3,7},{1,3},{7,7},{3,6}
		};
		
		long[] result = RangeSum1(arr, mat);

        // Printing the elements of the returned array
        for (long element : result) {
            System.out.print(element + " ");
        }
		
	}

}
