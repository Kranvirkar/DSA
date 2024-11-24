package com.scaler.dsa1.twoPointer;

public class twoSumK {
    /*
    * Given arr[N] distinct sorted elements, check if there exists pair[i,j] such that ar[i] +ar[j] =k && i!=j
    * 1. brute force two for loop
    * 2. using hashMap
    * 3. binary search
    * 4. two pointer
    * */

    public static boolean usingBinarySearch(int[] arr,int target){
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            int compliment =target-arr[i];
            int low=i,high=N-1;
            while (low<=high){
                int mid = (low+high)/2;
                if(arr[mid]==compliment){
                    return true;
                } else if(arr[mid]<compliment){
                    low=mid+1;
                }else {
                    high=mid-1;
                }
            }
        }
        return false;
    }

    public static boolean usingTwoPointer(int[] arr, int target){
        int N=arr.length;
        for (int i = 0; i < N; i++) {
            int p1=i,p2=N-1;
            while (p1<p2){
                if (arr[p1]+arr[p2]==target){
                    return true;
                } else if (arr[p1]+arr[p2]>target) {
                    p2--;
                }else {
                    p1++;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
    int[] arr ={3,7,8,11,14,19,20};
        System.out.println(usingBinarySearch(arr,25) ? "Exist" : "Not Exist");
        System.out.println(usingTwoPointer(arr,25) ? "Exist" : "Not Exist");

    }
}
