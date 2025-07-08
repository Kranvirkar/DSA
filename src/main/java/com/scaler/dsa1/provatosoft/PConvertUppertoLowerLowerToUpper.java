package com.scaler.dsa1.provatosoft;

/*
Write a java program to convert Lowercase to Uppercase and vice versa
in a given String.

*/

public class PConvertUppertoLowerLowerToUpper {
    public static void main(String[] args) {
        String input = "Hello World!";
        StringBuilder result = new StringBuilder();

        for (char ch:input.toCharArray()){
            if (ch>='a' && ch <='z'){
                result.append((char)(ch-32));
            }else if (ch>='A' && ch <='Z'){
                result.append((char)(ch+32));
            }else{
                result.append(ch);
            }
        }
        System.out.println("Converted "+result);
    }
}
