package com.scaler.dsa1.subarray;

public class SumOfAllOddLengthSubArray {
    public static int solve(int[] A) {
        int result=0;
        int n=A.length;
        for (int start=0;start<n;start++ ){
            int sum=0;
            for (int end=start;end<n;end++){
                int len=end-start+1;
                sum+=A[end];
                if(len%2!=0){
                    result+=sum;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a={1,3,4,5};
        int[] arr={2,3,7};
        System.out.println(solve(a));
        System.out.println(solve(arr));
    }
}
