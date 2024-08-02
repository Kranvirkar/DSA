package com.scaler.dsa1.string;

public class ReversewordsinAstring {
    public static void main(String args[])
    {   String s = "Welcome to Gfg";
        int n=s.length();
        System.out.println("Before reversing words in the string:");
        System.out.println(s);
        System.out.println("After reversing words in the string:");
        System.out.println(reverseWords(s,n));
    }

    //T.C: O(n)
    private static String reverseWords(String s, int n) {
        String[] str=s.split(" ");
        int low=0,high=str.length-1;
        while (low<high){
            String tmp=str[low];
            str[low]=str[high];
            str[high]=tmp;
            low++;
            high--;
        }
        return String.join(" ",str);
    }


}
