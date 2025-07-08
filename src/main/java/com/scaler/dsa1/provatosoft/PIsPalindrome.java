package com.scaler.dsa1.provatosoft;

public class PIsPalindrome {
    public static void main(String[] args) {
        String input = "madam";
        System.out.println("Input "+input+" is Palindrome "+input.equals(new StringBuilder(input)
                .reverse().toString()));
        System.out.println("Input "+input+" is Palindrome "+isPalindrome(input));
    }

    private static boolean isPalindrome(String input) {
        int start=0,end=input.length()-1;
        while (start<end){
            if(input.charAt(start)!=input.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}
