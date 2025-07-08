package com.scaler.dsa1.array;

import java.util.ArrayList;
import java.util.List;

public class CarryForward {
    public static void main(String[] args) {

        int[] A = {2, 9};
        int[] B = {9, 9, 9};
        int carry = 1;
        System.out.println(cForward(B, carry)); // Output: [1, 0, 0, 0]
    }

    private static List<Integer> cForward(int[] a, int carry) {
        List<Integer> list = new ArrayList<>();

        // Perform addition from end to start
        for (int i = a.length - 1; i >= 0; i--) {
            int tmp = a[i] + carry;
            a[i] = tmp % 10;
            carry = tmp / 10;
        }

        // If there's leftover carry, add it to the front
        if (carry == 1) {
            list.add(1);
        }

        // Add remaining digits to the list
        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);
        }

        return list;
    }
}
