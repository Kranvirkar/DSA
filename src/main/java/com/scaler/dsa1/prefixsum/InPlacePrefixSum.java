package com.scaler.dsa1.prefixsum;

public class InPlacePrefixSum {

	/*
		Given an array A of N integers. 
		Construct prefix sum of the array in the given array itself.
		Example Input
			Input 1:
				A = [1, 2, 3, 4, 5]
			Input 2:
				A = [4, 3, 2]
				
		Example Output
			Output 1:
				[1, 3, 6, 10, 15]
			Output 2:
				[4, 7, 9]
	*/
	
	public static int[] solve(int[] A) {
	    int n=A.length;
	    for(int i=1;i<n;i++){
	        A[i]=A[i-1]+A[i];
	    }  
	    return A;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1, 2, 3, 4, 5};
		int[] result = solve(A);

        // Printing the elements of the returned array
        for (long element : result) {
            System.out.print(element + " ");
        }
	}

}
