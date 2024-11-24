package com.scaler.dsa1.searching;

public class LocalMaxima {
    public static void main(String[] args) {
        int[] a={9,8,7,3,6,4,1,5,2,10,-4};
        System.out.println(localMaxima(a));
    }

    private static int localMaxima(int[] a) {
        int N=a.length;
        if (N==1){
            return a[0];
        }
        if (a[0] > a[1]) {
            return a[0];
        }
        if (a[N-1]>a[N-2]){
            return a[N-1];
        }
        int low =1 ,high=N-2;
        while (low<=high){
            int m=(low+high)/2;
            if(a[m]>a[m-1] && a[m]>a[m+1]){
                System.out.println(a[m]);
                return a[m];
            }
            if (a[m]<a[m-1]){
                high=m-1;
            }else {
                low=m+1;
            }
        }
        return -1;
    }
}
