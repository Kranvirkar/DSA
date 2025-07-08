package com.scaler.dsa1.array;

import java.util.Arrays;

public class RotateArray {
    static int[] arr={1, 2, 3, 4, 5};
    static void rotateArr(int arr[], int d) {
        int n=arr.length;
        int[] newArr=new int[d];
        for(int i=0;i<d;i++){
            newArr[i]=arr[i];
        }
        for(int i=0;i<n-d;i++){
            arr[i]=arr[i+d];
        }
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<newArr.length;i++){
            arr[n-d+i]=newArr[i];
        }
    }

    private static void rotateKplace(int[] arr,int k){
        k=k%arr.length;
        reversek(arr,0,k-1);
        reversek(arr,k, arr.length-1);
        reversek(arr,0, arr.length-1);

    }

    private static void reversek(int[] arr, int start, int end) {
        while (start<end){
            int temp=arr[start];
            arr[start++]=arr[end];
            arr[end--]=temp;
        }
    }

    public static void main(String[] args) {
        int d=2;
        rotateArr(arr,d);
        System.out.println(Arrays.toString(arr));
        rotateKplace(arr,d);
        System.out.println(Arrays.toString(arr));
    }
}
