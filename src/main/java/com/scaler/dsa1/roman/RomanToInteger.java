package com.scaler.dsa1.roman;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));       // Output: 3
        System.out.println(romanToInt("LVIII"));     // Output: 58
        System.out.println(romanToInt("MCMXCIV"));   // Output: 1994
    }

    private static int romanToInt(String str) {
        int total=0 , n=str.length();
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        for (int i = 0; i < n; i++) {
            int currentValue= romanMap.get(str.charAt(i));
            if (i<n-1 && currentValue<romanMap.get(str.charAt(i+1))){
                total-=currentValue;
            }else {
                total+=currentValue;
            }
        }
        return total;
    }
}
