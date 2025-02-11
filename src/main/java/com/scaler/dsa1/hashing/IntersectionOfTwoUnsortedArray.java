package com.scaler.dsa1.hashing;

import java.util.HashSet;

public class IntersectionOfTwoUnsortedArray {

    // bruteforce
    public static void intersection(int[] a, int m, int[] b, int n) {
        for (int i = 0; i < m; i++) {
            boolean flag = false;

            for (int j = 0; j < n; j++) {
                if (a[i] == b[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag)
                System.out.print(a[i] + " ");
        }
    }
//Optimised
    public static void intersect(int[] a, int[] b, int m, int n) {
        HashSet<Integer> s = new HashSet<>();

        for (int num : b) {
            s.add(num);
        }

        for (int i = 0; i < m; i++) {
            if (s.contains(a[i])) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {10, 20, 30};
        int[] b = {30, 20, 10};
        int m = a.length;
        int n = b.length;

        intersection(a, m, b, n);
    }
}
