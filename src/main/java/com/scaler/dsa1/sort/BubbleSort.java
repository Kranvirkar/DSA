package com.scaler.dsa1.sort;

public class BubbleSort {

	
	public static void optimizedBubbleSort(int arr[]) {
		boolean swap;
		for (int i = 0; i < arr.length; i++) {
			swap =false;
			//int sw=0;
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swap=true;
					//sw++;
				}
			}
			if (!swap) {
				//if (sw==0) {
				break;
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		int[] array = {64, 34, 25, 12, 22, 11, 90};
        optimizedBubbleSort(array);

        System.out.println("Sorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

	}

}
