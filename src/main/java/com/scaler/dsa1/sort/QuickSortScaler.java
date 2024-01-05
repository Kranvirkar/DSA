package com.scaler.dsa1.sort;

import java.util.Arrays;

public class QuickSortScaler {

	public static void main(String[] args) {
		int arr[] = {8,4,7,9,3,10,5};
		qsort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));

	}

	private static void qsort(int[] arr, int start, int end) {
		if (start>=end) {
			return;
		}
		int j=start;
		int x=arr[end];
		for (int i = start; i < end; i++) {
			if (arr[i]<x) {
				int temp = arr[i];
				arr[i]= arr[j];
				arr[j]=temp;
				j++;
			}
		}
		int temp =arr[j];
		arr[j]=arr[end];
		arr[end]=temp;
		int p=j;
			//int pivot =ipartition(arr,start,end);
			qsort(arr, start, p-1);
			qsort(arr, p+1, end);
		}
		
	


}
