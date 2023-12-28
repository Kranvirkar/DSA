package com.scaler.dsa1.prefixsum;

public class Equbrium {

	/*	
		given ar[N] elements , count no. of equlibrium index an index i s said to be equlibrim
		index if: summ of all elements on left of ith index is equal to sum of all elements 
		on right of ith index
		Note : i==0, leftsum=0
		if i==N-1, rightSum=0 
		TC: O(N)  SC:O(N)
	*/	
	
	public static int equlibrium(int ar[]) {
		int N = ar.length;
		int psum[]= new int[N];
		psum[0]=ar[0];
		for (int i = 1; i < psum.length; i++) {
			psum[i]=psum[i-1]+ar[i];
		}
		int count=0;
		for (int i = 0; i < N; i++) {
			long left;
			if (i==0) {
				left=0;
			}else {
				left=psum[i-1];
			}
			long right=psum[N-1]-psum[i];
			if (left==right) {
				count+=1;
			}
		}
		return count;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {-7,1,5,2,-4,3,0};
		System.out.println(equlibrium(arr));
	}

}
