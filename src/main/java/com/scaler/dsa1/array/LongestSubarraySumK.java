package com.scaler.dsa1.array;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarraySumK {

        //T.C -O(n) S.C -O(1)
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

    public static int lenOfLongestSubarr1(int[] arr, int k) {
            int maxLength=0,sum=0;
        Map<Integer,Integer> map =new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if(sum==k) maxLength=i+1;
            if(map.containsKey(sum-k)){
                maxLength=Math.max(maxLength,i-map.get(sum-k));
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
            return maxLength;
    }


    public static void main(String[] args) {
        int[] array ={10, 5, 2, 7, 1, 9};
        int target =15;
        System.out.println(lenOfLongestSubarr1(array,target));
    }
}
