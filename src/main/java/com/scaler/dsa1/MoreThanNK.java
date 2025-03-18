package com.scaler.dsa1;

import java.util.Arrays;

public class MoreThanNK {
    public static void main(String[] args) {

        int[] arr3 = {0, 5, 6, 6, 0, 4, 3, 1, 5, 3, 2, 6, 1, 2};;
        int k3 = 11;
        System.out.println(countElements(arr3, k3)); // Output: 6

        int[] arr1 = {3, 1, 2, 2, 1, 2, 3, 3};
        int k1 = 4;
        System.out.println(countElements(arr1, k1)); // Output: 2

        int[] arr2 = {2, 3, 3, 2};
        int k2 = 3;
        System.out.println(countElements(arr2, k2)); // Output: 2


    }

    private static int  countElements(int[] arr, int k) {
        int n =arr.length,threshold=n/k,count=1,ans=0;
        Arrays.sort(arr);
        for(int i=1;i<n;i++){
            if(arr[i-1]==arr[i]){
                count++;
            }else{
                if(count>threshold){
                    ans++;
                }
                count=1;
            }

        }
        if(count>threshold){
            ans++;
        }
        return ans;
    }
}
