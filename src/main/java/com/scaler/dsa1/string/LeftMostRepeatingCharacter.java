package com.scaler.dsa1.string;

import java.util.Arrays;

public class LeftMostRepeatingCharacter {

    //T.C O(n^2)
    static int leftMost(String str)
    {
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j))return i;
            }
        }
        return -1;
    }

    static final int CHAR=256;
    static int leftMost1(String str)
    {
        int[] count=new int[CHAR];
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
            count[str.charAt(i)]++;
        }
        System.out.println(Arrays.toString(count));
        for(int i=0;i<str.length();i++){
            if(count[str.charAt(i)]>1)return i;
        }
        return -1;
    }

    public static void main(String args[])
    {   String str = "geeksforgeeks";
        System.out.println("Index of leftmost repeating character:");
        System.out.println(leftMost1(str));
    }
}
