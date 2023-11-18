package com.scaler.dsa1.prefixsum;

public class RangeSumQuery {

	/*
	 * You are given an integer array A of length N. You are also given a 2D integer
	 * array B with dimensions M x 2, where each row denotes a [L, R] query. For
	 * each query, you have to find the sum of all elements from L to R indices in A
	 * (0 - indexed). More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1]
	 * + A[R] for each query.
	 * 
	 * 
	 * Example Input
	Input 1:
		A = [1, 2, 3, 4, 5]
		B = [[0, 3], [1, 2]]
	Input 2:
		A = [2, 2, 2]
		B = [[0, 0], [1, 2]]

	Example Output
	Output 1:
		[10, 5]
	Output 2:

		[2, 4]
	 */
	
	public static long[] rangeSum(int[] A, int[][] B) {
        int n=B.length;
        long[] result =new long[n];
        long[] ps =new long[A.length];
        ps[0]=A[0];
        for(int i=1;i<A.length;i++){
            ps[i]=ps[i-1]+A[i];
        }
        for(int i=0;i<n;i++){
            int start=B[i][0];
            int end =B[i][1];
                if(start==0){
                    result[i]=ps[end];
                }else{
                result[i]=ps[end]-ps[start-1];
                }
            }
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, 4, 5};
		int mat[][] = {
				{0, 3}, {1, 2}
		};
		
		long[] result = rangeSum(arr, mat);

        // Printing the elements of the returned array
        for (long element : result) {
            System.out.print(element + " ");
        }
	}

}
