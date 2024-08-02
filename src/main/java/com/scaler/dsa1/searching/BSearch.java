package com.scaler.dsa1.searching;

public class BSearch {
    public static void main(String args[])
    {
        int arr[] = {10, 20, 30, 40, 50, 60}, n = 6;

        int x = 20;

        System.out.println(bSearch(arr, n, x));

    }

    private static int bSearch(int[] arr, int n, int x) {
        int low=0,high=n-1;
        while (low<=high){
            int mid=(low+high)/2;
            if (arr[mid]==x){
                return mid;
            }else if (arr[mid]<x){
                low=mid+1;
            }else {
                high=mid-1;
            }
        }
        return -1;
    }
}
