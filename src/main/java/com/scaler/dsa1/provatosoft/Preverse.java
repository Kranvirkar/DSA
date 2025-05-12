package com.scaler.dsa1.provatosoft;

/*
    Write a Java Program to reverse a string without using String inbuilt functions.


*/
public class Preverse {
    public static void main(String[] args) {
        String str ="GeekForGeeks";
        reverseString(str);
    }

    private static void reverseString(String str) {
        char[] ch =str.toCharArray();
        int start = 0, end=ch.length-1;
        while (start<end){
            char tmp =ch[start];
            ch[start]=ch[end];
            ch[end]=tmp;
            start++;
            end--;
        }
        System.out.println("Before reverse "+ str);
        System.out.println("After reverse "+ new String(ch));
    }
}
