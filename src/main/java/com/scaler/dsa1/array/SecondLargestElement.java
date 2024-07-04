package com.scaler.dsa1.array;

public class SecondLargestElement {
    public static int print2largest(int arr[]) {
    int n=arr.length;
    int prev = 0,max=Integer.MIN_VALUE;
    
    for (int i=0;i<n;i++){
        if(arr[i]>max){
            prev=max;
            max=arr[i];
        }else if(arr[i]>prev && arr[i]!=max){
            prev=arr[i];
        }
    }
    return prev;
    }

    /* Driver program to test above function */
    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};
        System.out.println(print2largest(arr));
    }
}
