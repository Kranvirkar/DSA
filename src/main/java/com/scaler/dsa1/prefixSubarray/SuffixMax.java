package com.scaler.dsa1.prefixSubarray;

public class SuffixMax {

	/*
	Given an array A of length N, For every index i, you need to find the maximum value in subarray from i to N-1.
	Input 1:

	A = [12, 5, 6, 7]
	Input 2:

	A = [15, 9, 7, 11, 10]

	Example Output
	Output 1:

	[12, 7, 7, 7]
	Output 2:

	[15, 11, 11, 11, 10]
	*/
	
	public static int[] solve(int[] A) {
        int N= A.length;
        int[] result =new int[N];
        result[N-1]=A[N-1];
        int max=A[N-1];
        for(int i=N-2;i>=0;i--){
            if(max<A[i]){
               max=A[i];
            }
            result[i]=max;
        }
        return result;
    }
	
	public static void main(String[] args) {
		int[] A = {12, 5, 6, 7};
		int[] result = solve(A);

        // Printing the elements of the returned array
        for (long element : result) {
            System.out.print(element + " ");
        }

	}

}
