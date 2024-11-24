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

    public static void main(String[] args) {

        int d=2;
        rotateArr(arr,d);
        System.out.println(Arrays.toString(arr));
    }
}
