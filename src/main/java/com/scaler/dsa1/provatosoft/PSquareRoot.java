package com.scaler.dsa1.provatosoft;

public class PSquareRoot {
    public static void main(String[] args) {
        int input =25;
        System.out.println("Input "+input+" "+Math.sqrt(input));
        System.out.println("Input "+input+" "+Math.pow(input,0.5));
        System.out.println("Input "+input+" "+squarRootUsingBinarySearch(input));
    }

    //floor
    private static long squarRootUsingBinarySearch(int input) {
        long low=1,high=input,ans=0;
        while (low<=high){
            long mid =(low+high)/2;
            if (mid==input/mid) return mid;
            if(mid<input/mid){
                low=mid+1;
                ans=mid;
            }else {
                high=mid-1;
            }
        }
        return ans;
    }
}
