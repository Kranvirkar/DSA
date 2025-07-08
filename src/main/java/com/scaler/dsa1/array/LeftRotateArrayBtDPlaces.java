package com.scaler.dsa1.array;

import java.util.Arrays;

public class LeftRotateArrayBtDPlaces {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2;
        int n=arr.length;
        System.out.println("Original Array: "+ Arrays.toString(arr));
       // System.out.println("Modified Array: "+ Arrays.toString(leftRotate(arr,d)));
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        System.out.println("Modified Array: "+ Arrays.toString(arr));
    }

    public static void reverse(int[] arr,int start,int end){
        while (start<end){
            int temp =arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
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
