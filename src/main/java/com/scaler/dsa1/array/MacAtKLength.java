package com.scaler.dsa1.array;

import java.util.ArrayList;

public class MacAtKLength {
    public static ArrayList<Integer> max_of_subarrays(int arr[], int k) {
        int n =arr.length;
        ArrayList<Integer> list =new ArrayList<>();
        for(int i=0;i<=n-k;i++){
            int max=arr[i];
            for(int j=i;j<i+k;j++){
                max=Math.max(max,arr[j]);
            }
            list.add(max);
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr ={1, 2, 3, 1, 4, 5, 2, 3, 6};
        max_of_subarrays(arr,3).forEach(System.out::print);
    }
}
