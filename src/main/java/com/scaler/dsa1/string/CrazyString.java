package com.scaler.dsa1.string;

public class CrazyString {

    static String getCrazy(String s) {
        StringBuilder sb =new StringBuilder();
        sb.append(s.charAt(0));
        if(Character.isLowerCase(s.charAt(0))){
            for (int i = 1; i < s.length(); i++) {
                if(i%2==1){
                    sb.append(Character.toUpperCase(s.charAt(i)));
                }else {
                    sb.append(Character.toLowerCase(s.charAt(i)));
                }
            }
        }else{
            for (int i = 1; i < s.length(); i++) {
                if(i%2==1){
                    sb.append(Character.toLowerCase(s.charAt(i)));
                }else {
                    sb.append(Character.toUpperCase(s.charAt(i)));
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(getCrazy("geeksforgeeks"));  // Output: gEeKsFoRgEeKs
        System.out.println(getCrazy("Geeksforgeeks"));  // Output: GeEkSfOrGeEkS
    }
}
