package com.scaler.dsa1.prefixSubarray;

public class Test {
    public static void main(String[] args) {
        int[] A = {4,2,5,7,4,2,3,6,8,2,3};
        System.out.println(waterLogging(A));
    }

    private static int waterLogging(int[] a) {
        int ans = 0,left,right ,level,water;
        int[] pfMax=pfMax(a);
        int[] sfMax=sfMax(a);
        for (int i = 0; i <a.length ; i++) {
             left=pfMax[i];
             right=sfMax[i];
             level=Math.min(left,right);
             water=level-a[i];
             ans+=water;
        }
        return ans;
    }

    private static int[] sfMax(int[] a) {
        int n=a.length;
        int[] result =new int[n];
        result[n-1]=a[n-1];
        int max =a[n-1];
        for (int i = n-2; i >=0; i--) {
            if (max<a[i]){
                max=a[i];
            }
            result[i]=max;
        }
        return result;
    }

    private static int[] pfMax(int[] a) {
        int[] result =new int[a.length];
        result[0]=a[0];
        int max =a[0];
        for (int i = 1; i < a.length; i++) {
            if (max<a[i]){
                max=a[i];
            }
            result[i]=max;
        }
        return result;
    }
}
