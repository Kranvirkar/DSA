package com.scaler.dsa1.provatosoft;

import java.util.Arrays;

public class PSecondHighestElement {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};

        System.out.println("Input Array: " + Arrays.toString(arr));

        int second1 = usingTwoVariable(arr);
        if (second1 == Integer.MIN_VALUE) {
            System.out.println("Second highest number (Two-variable approach): Not found (less than 2 distinct values)");
        } else {
            System.out.println("Second highest number (Two-variable approach): " + second1);
        }

        int second2 = usingStream(arr);
        if (second2 == Integer.MIN_VALUE) {
            System.out.println("Second highest number (Stream approach): Not found (less than 2 distinct values)");
        } else {
            System.out.println("Second highest number (Stream approach): " + second2);
        }
    }

    private static int usingTwoVariable(int[] arr) {
        if (arr == null || arr.length < 2) return Integer.MIN_VALUE;

        int highest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > highest) {
                second = highest;
                highest = num;
            } else if (num > second && num != highest) {
                second = num;
            }
        }

        return (second == Integer.MIN_VALUE) ? Integer.MIN_VALUE : second;
    }

    private static int usingStream(int[] arr) {
        return Arrays.stream(arr)
                .distinct()
                .boxed()
                .sorted((a, b) -> b - a)
                .skip(1)
                .findFirst()
                .orElse(Integer.MIN_VALUE);
    }
}
