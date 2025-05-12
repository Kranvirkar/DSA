package com.scaler.dsa1.sort;

import java.util.Arrays;

public class MergeSort {


	public static void mergeSort(int[] A,int start,int end) {
		if (start==end) {
			return;
		}
		int mid=(start+end)/2;
		mergeSort(A, start, mid);
		mergeSort(A, mid+1, end);
		merge(A, start, mid, end);
	}

	public static void merge(int[] A,int start,int mid,int end) {
		int[] temp=new int[end-start+1];
		int p1=start,p2=mid+1,p3=0;
		while (p1<=mid && p2<=end) {
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
		while (p1<=mid) {
			temp[p3]=A[p1];
			p3++;
			p1++;
		}

		while (p2<=end) {
			temp[p3]=A[p2];
			p3++;
			p2++;
		}
		int k=0;
		for (int i = start; i <= end; i++) {
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
