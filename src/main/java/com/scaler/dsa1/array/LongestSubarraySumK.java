package com.scaler.dsa1.array;

public class LongestSubarraySumK {
        public static int lenOfLongestSubarr(int[] arr, int k) {
            int length=0;
            int n =arr.length;
            int left=0,sum=0;
            for(int i =0;i<n;i++){
                sum+=arr[i];
                while(sum>k && left<=i){
                    sum-=arr[left];
                    left++;
                }
                if(sum==k){
                    length=Math.max(length,i-left+1);
                }
            }
            return length;
        }

    public static void main(String[] args) {
        int[] array ={10, 5, 2, 7, 1, 9};
        int target =15;
        System.out.println(lenOfLongestSubarr(array,target));
    }
}
