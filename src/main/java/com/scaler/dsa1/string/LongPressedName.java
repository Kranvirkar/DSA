package com.scaler.dsa1.string;

public class LongPressedName {
    public static boolean isLongPressedName(String name, String typed) {
        int i=0,j=0;
        char lastChar ='\0';
        while (j<typed.length()){
            if (i<name.length() && name.charAt(i)==typed.charAt(j)){
                lastChar=name.charAt(i);
                i++;
            } else if (typed.charAt(j)==lastChar) {

            }else {
                return false;
            }
            j++;
        }
        return i==name.length();
    }

    public static void main(String[] args) {
        System.out.println(isLongPressedName("alex", "aaleex")); // true
        System.out.println(isLongPressedName("saeed", "ssaaedd")); // false
        System.out.println(isLongPressedName("leelee", "lleeelee")); // true
        System.out.println(isLongPressedName("alex", "alexxr")); // false
        System.out.println(isLongPressedName("a", "aaaaaa")); // true
    }
}
