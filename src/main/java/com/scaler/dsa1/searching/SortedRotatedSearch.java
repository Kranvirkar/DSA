package com.scaler.dsa1.searching;

public class SortedRotatedSearch {

    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) return mid; // Found target

            // Check if left half is sorted
            if (nums[left] <= nums[mid]) {
                // Target is in the left sorted half
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            // Otherwise, the right half is sorted
            else {
                // Target is in the right sorted half
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1; // Target not found
    }

    public static void main(String args[])
    {
        int arr[] = {10, 20, 40, 60, 5, 8}, n = 6;

        int x = 5;

        System.out.println(search(arr, x));
    }

}
