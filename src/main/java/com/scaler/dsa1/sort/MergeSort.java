package com.scaler.dsa1.sort;

import java.util.Arrays;

public class MergeSort {

	
	public static void mergeSort(int[] A,int s,int e) {
		if (s==e) {
			return;
		}
		int m=(s+e)/2;
		mergeSort(A, s, m);
		mergeSort(A, m+1, e);
		merge(A, s, m, e);
	}
	
	public static void merge(int[] A,int s,int m,int e) {
		int[] temp=new int[e-s+1];
		int p1=s,p2=m+1,p3=0;
		while (p1<=m && p2<=e) {
			if (A[p1]<A[p2]) {
				temp[p3]=A[p1];
				p3++;
				p1++;
			} else {
				temp[p3]=A[p2];
				p3++;
				p2++;
			}
		}
		while (p1<=m) {
			temp[p3]=A[p1];
			p3++;
			p1++;
		}
		
		while (p2<=e) {
			temp[p3]=A[p2];
			p3++;
			p2++;
		}
		int k=0;
		for (int i = s; i <= e; i++) {
			A[i]=temp[k];
			k++;
		}
	}
	
	public static void main(String[] args) {
		int[] a= {2,6,9,14,19,21,3,5,8,11,13};
		mergeSort(a, 0, a.length - 1);
	    System.out.println("Sorted array: " + Arrays.toString(a));
		

	}

}
