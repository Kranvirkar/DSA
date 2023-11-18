package com.scaler.dsa1.prefixsum;

public class EvenNumbersInARange {

	/*
	You are given an array A of length N and Q queries given by the 2D array B of size Q×2.
	Each query consists of two integers B[i][0] and B[i][1].
	For every query, your task is to find the count of even numbers in the range from A[B[i][0]] to A[B[i][1]].
Example Input
Input 1:
A = [1, 2, 3, 4, 5]
B = [   [0, 2] 
        [2, 4]
        [1, 4]   ]
Input 2:
A = [2, 1, 8, 3, 9, 6]
B = [   [0, 3]
        [3, 5]
        [1, 3] 
        [2, 4]   ]


Example Output
Output 1:
[1, 1, 2]
Output 2:
[2, 1, 1, 1]		
	*/	
	
	public static int[] solve(int[] A, int[][] B) {
        int evenOdd[]=new int[A.length];
        for(int i=0;i<A.length;i++){
            if(A[i]%2 == 0){
                evenOdd[i] = 1;
            }else{
                evenOdd[i] = 0;
            }
        }
        int pS[] = new int[evenOdd.length];
        pS[0] = evenOdd[0];
        for(int i = 1; i < evenOdd.length; i++){
            pS[i] = pS[i-1] + evenOdd[i];
        }
        int result[] = new int[B.length];
        for(int i = 0;i < B.length; i++) {
            int left = B[i][0] , right = B[i][1];
            if(left == 0){
                result[i] = pS[right];
            }else{
                result[i] = pS[right] - pS[left-1];
            }
        }
        return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, 4, 5};
		int mat[][] = {
				{0, 2}, {2,4},{1,4}
		};
		
		int[] result = solve(arr, mat);

        // Printing the elements of the returned array
        for (long element : result) {
            System.out.print(element + " ");
        }
	}

}
