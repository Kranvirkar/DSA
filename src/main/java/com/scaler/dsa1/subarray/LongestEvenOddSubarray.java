package com.scaler.dsa1.subarray;

public class LongestEvenOddSubarray {
    public static void main(String[] args) {
        int arr[] = {5, 10, 20, 6, 3, 8}, n = 6;

        System.out.println(maxEvenOdd1(arr, n));
    }

    //brute force
    private static int maxEvenOdd(int[] arr, int n) {
        int result =1;
        for (int i = 0; i < n; i++) {
            int current=1;
            for (int j = i+1; j < n; j++) {
                if ((arr[j]%2==0 && arr[j-1]%2!=0) || (arr[j]%2!=0 && arr[j-1]%2==0)){
                    current++;
                }else {
                    break;
                }
                result=Math.max(result,current);
            }
        }
        return result;
    }
    //optimised
    static int maxEvenOdd1(int arr[], int n)
    {
        int res = 1;
        int curr = 1;

        for(int i = 1; i < n; i++)
        {
            if((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0)
                    ||(arr[i] % 2 != 0 && arr[i - 1] % 2 == 0))
            {
                curr++;

                res = Math.max(res, curr);
            }
            else
                curr = 1;
        }

        return res;
    }
}
