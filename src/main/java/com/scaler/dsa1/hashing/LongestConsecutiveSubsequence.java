package com.scaler.dsa1.hashing;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSubsequence {
    public static void main (String[] args)
    {
        int arr[] = new int[]{1, 9, 3, 4, 2, 10, 13};

        int n = arr.length;

        System.out.println(findLongest(arr, n ));

    }

    private static int findLongest(int[] arr, int n) {
        int result=1,current=1;
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]==arr[i-1]+1){
                current++;

            }else {
                result=Math.max(result,current);
                current=1;
            }
        }
        return result;
    }

    static int findLongest1(int arr[], int n)
    {
        HashSet<Integer> s=new HashSet<>();
        int res = 0;

        for (int i = 0; i < n; i++)
            s.add(arr[i]);

        for (int i = 0; i < n; i++) {
            if (!s.contains(arr[i] - 1)) {
                int curr = 1;
                while (s.contains(curr+arr[i]))
                    curr++;

                res = Math.max(res, curr);
            }
        }
        return res;
    }
}
