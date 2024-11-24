package com.scaler.dsa1.roman;

public class IntegerToRoman {

    public static void main(String[] args) {
        System.out.println(intToRoman(
                3749));
    }

    private static String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder roman = new StringBuilder();

        // Iterate through values and symbols
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                roman.append(symbols[i]); // Append Roman numeral symbol
                num -= values[i];        // Subtract value from number
            }
        }
        return roman.toString();
    }
}
