package com.scaler.dsa1.provatosoft;

import java.util.Arrays;
/*
Find the maximum value in Array without using Collection?
Suppose there is an array {1,7,91,12,57} , then the answer should be 91
as it is the maximum value in the given array.

*/

public class PMaxValueNotUsingCollections {

    public static void main(String[] args) {
        int[] arr ={1,7,91,12,57};
        System.out.println(Arrays.toString(arr)+" arrays max Element is "+iterativeApproach(arr));
        System.out.println(Arrays.toString(arr)+" arrays max Element is "+streamApproach(arr));
    }

    private static int iterativeApproach(int[] arr) {
        int max=arr[0];
        for (int temp:arr){
            if(max<temp){
                max=temp;
            }
        }
        return max;
    }

    private static int streamApproach(int[] arr) {
        return Arrays.stream(arr).
                max().getAsInt();
    }
}
