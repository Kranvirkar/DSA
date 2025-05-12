package com.scaler.dsa1.provatosoft;

public class PremoveWhiteSpaces {

    public static void main(String[] args) {
        String input = "  Hello   World! This is Java.  ";
        System.out.println("Input: " + input);
        System.out.println("Output using replace(): " + usingReplace(input));
        System.out.println("Output without using replace(): " + usingWithoutReplace(input));
    }

    private static String usingReplace(String input) {
        return input.replaceAll("\\s", "");  // This uses regex to remove all whitespace
    }

    private static String usingWithoutReplace(String input) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!Character.isWhitespace(ch)) {
                builder.append(ch);
            }
        }
        return builder.toString();
    }
}
