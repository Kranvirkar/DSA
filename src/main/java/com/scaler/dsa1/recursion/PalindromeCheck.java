package com.scaler.dsa1.recursion;

public class PalindromeCheck {

    /*
    Time complexity : O(n)
    Auxiliary space : O(n)
    */
    public static boolean isPalindrome(String s, int i){
        if(i > s.length()/2)
        {
            return true ;
        }
        return s.charAt(i) == s.charAt(s.length()-i-1) && isPalindrome(s, i+1) ;
    }

    public static void main (String[] args) {
        String str = "geeg" ;
        if (isPalindrome(str, 0))
        { System.out.println("Yes"); }
        else
        { System.out.println("No"); }

    }
}
