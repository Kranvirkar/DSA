package com.scaler.dsa1.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingFirstPositiveNumber {

    //T.C -O(n log n)	 S.C -O(1)
    public static  int firstMissingPositive(int[] nums) {
        // Sort the array
        Arrays.sort(nums);

        int expected = 1; // Start from the smallest positive integer
        for (int num : nums) {
            if (num == expected) {
                expected++; // Move to the next expected positive integer
            } else if (num > expected) {
                // As the array is sorted, we found a gap
                return expected;
            }
        }

        // If all numbers from 1 to n are present, return the next number
        return expected;
    }

    private static int firstMissingPositive1(int[] nums){
        Set<Integer> hs =new HashSet<>();
        for (int num:nums){
            hs.add(num);
        }
        for (int i = 1; i <nums.length+1 ; i++) {
            if (!hs.contains(i)) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums={3,0,1};
        System.out.println(firstMissingPositive(nums));
    }
}
