package com.scaler.dsa1.array;

import java.util.Arrays;

public class MissingFirstPositiveNumber {

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

    public static void main(String[] args) {

        int[] nums={3,0,1};
        System.out.println(firstMissingPositive(nums));
    }
}
