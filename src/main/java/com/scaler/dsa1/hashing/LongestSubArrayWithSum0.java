package com.scaler.dsa1.hashing;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSum0 {
    public static int solve(int[] A) {
        //return bruteforce(A);
        return optimisedWay(A);
    }

    public static int bruteforce(int[] A){
        int n=A.length;
        int maxLength=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=A[j];
                if(sum==0){
                    maxLength=Math.max(maxLength,j-i+1);
                }
            }
        }
        return maxLength;
    }

    public static int optimisedWay(int[] A){
        int maxLength=0,n=A.length,sum=0;
        Map<Integer,Integer> mapIndex=new HashMap<>();
        for(int i=0;i<n;i++){
            sum+=A[i];
            if(sum==0){
                maxLength=i+1;
            }
            if(mapIndex.containsKey(sum)){
                maxLength=Math.max(maxLength,i-mapIndex.get(sum));
            }else{
                mapIndex.put(sum,i);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println(solve(arr)); // Output: 5
    }
}
