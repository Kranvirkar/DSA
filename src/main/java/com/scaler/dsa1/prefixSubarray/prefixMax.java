package com.scaler.dsa1.prefixSubarray;

public class prefixMax {

	/*
	Kamal is a software developer and he's working on a new feature for an e-commerce website. The website
	has a list of prices for different products, and Kamal needs to find the maximum price of all products up to a given index.

	He has the list of prices in an array A of length N, and he needs to write a program that will return the maximum price 
	occurring in the subarray from 0 to i for every index i. Kamal needs your help to implement this function.
	
	Input 1:

	A = [9, 7, 6, 18, 2]
	Input 2:

	A = [16, 8, 24, 9, 25, 17]


	Example Output
	Output 1:

	[9, 9, 9, 18, 18]
	Output 2:

	[16, 16, 24, 24, 25, 25]
	*/
	
	public static int[] solve(int[] A) {
        int N= A.length;
        int[] result =new int[N];
        result[0]=A[0];
        int max=A[0];
        for(int i=1;i<N;i++){
            if(max<A[i]){
               max=A[i];
            }
            result[i]=max;
        }
        return result;
    }
	
	public static void main(String[] args) {
		int[] A = {9, 7, 6, 18, 2};
		int[] result = solve(A);

        // Printing the elements of the returned array
        for (long element : result) {
            System.out.print(element + " ");
        }

	}

}
