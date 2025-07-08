package com.scaler.dsa1.array;

import java.util.Arrays;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int arr[] = {0, 1, 9, 8, 4, 0, 0, 2,
                7, 0, 6, 0, 9};
        System.out.println("Original Array:"+Arrays.toString(arr));

        System.out.println("Modified Array:"+Arrays.toString(moveZero(arr)));
        System.out.println("Modified Array:"+Arrays.toString(moveZeroToEnd(arr)));
    }

    private static int[] moveZeroToEnd(int[] arr){
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                arr[temp]=arr[i];
                temp++;
            }
        }
        for (int i = temp; i < arr.length; i++) {
            arr[i]=0;
        }
        return arr;
    }









    private static int[] moveZero(int[] arr) {
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0){
                arr[count++]=arr[i];
            }
        }
        for (int i = count; i <arr.length ; i++) {
            arr[i]=0;
        }
        return arr;
    }
}
