package com.scaler.dsa1.sort;

import java.util.Arrays;

public class QuickSort {

	public static void qsort(int[] arr,int start,int end) {
		if (start<end) {
			int p=iPartition(arr,start,end);
			qsort(arr, start, p-1);
			qsort(arr, p+1, end);
		}
	}
	
	private static int iPartition(int[] arr, int start, int end) {
		int pivot=arr[end];
		int i=start-1;
		for (int j = start; j < end; j++) {
			if (arr[j]<pivot) {
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
		}}
			int temp=arr[i+1];
			arr[i+1]=arr[end];
			arr[end]=temp;

		return i+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {8,4,7,9,3,10,5};
		qsort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
