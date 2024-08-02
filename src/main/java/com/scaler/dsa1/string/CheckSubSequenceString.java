package com.scaler.dsa1.string;

import java.util.Scanner;

public class CheckSubSequenceString {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();

        String s1, s2;
        s1 = sc.next();
        s2 = sc.next();

        System.out.println(isSubSeq(s1, s2, n, m));

//        6 3
//        ABCDEF
//                ABD

    }

    private static boolean isSubSeq(String s1, String s2, int n, int m) {
        int j=0;
        for (int i = 0; i < n && j < m; i++) {
            if (s1.charAt(i)==s1.charAt(j)){
                j++;
            }
        }
        return j==m;
    }
}
