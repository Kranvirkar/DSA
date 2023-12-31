package com.scaler.dsa1.sort;

import java.util.Arrays;

public class MergeTwoSort {

	public static int[] mergeTwoSort(int[] A,int[] B) {
		int N = A.length;
		int M = B.length;
		int[] C =new int[N+M];
		int p1=0,p2=0,p3=0;
		while(p1<N && p2<M) {
			if (A[p1] <B[p2]) {
				C[p3]=A[p1];
				p1++;
				p3++;
			} else {
				C[p3]=B[p2];
				p2++;
				p3++;
			}
		}
		
		while (p1<N) {
			C[p3]=A[p1];
			p1++;
			p3++;
		}
		
		while (p2<M) {
			C[p3]=B[p2];
			p2++;
			p3++;
		}
		return C;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,6,9,14,19,21};
		int[] b = {3,5,8,11,13};
		System.out.println(Arrays.toString(mergeTwoSort(a,b)));
	}

}
