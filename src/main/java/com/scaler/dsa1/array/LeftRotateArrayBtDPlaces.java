package com.scaler.dsa1.array;

import java.util.Arrays;

public class LeftRotateArrayBtDPlaces {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5},  d = 2;
        System.out.println("Original Array: "+ Arrays.toString(arr));
        System.out.println("Modified Array: "+ Arrays.toString(leftRotate(arr,d)));
    }

    private static int[] leftRotate(int[] arr,int d) {
        int[] temp=new int[d];
        for (int i = 0; i < d; i++) {
            temp[i]=arr[i];
        }
        for (int i = d; i < arr.length; i++) {
            arr[i-d]=arr[i];
        }
        for (int i = 0; i < d; i++) {
            arr[arr.length-d+i]=temp[i];
        }
        return arr;
    }
}
