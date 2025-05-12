package com.scaler.dsa1.provatosoft;

import java.util.Arrays;
import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Panagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(str1 + " and " + str2 + " are anagrams? " + isAnagram(str1, str2));

    }

    private static boolean isAnagram(String str1, String str2) {
        if (str1.length() !=str2.length()) return false;
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
    }

    public static boolean isAnagram1(String s1, String s2) {
        return s1.length() == s2.length() &&
                s1.chars().boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                        .equals(s2.chars().boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
    }

    public static boolean isAnagram2(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : s2.toCharArray()) {
            if (!map.containsKey(c)) return false;
            map.put(c, map.get(c) - 1);
            if (map.get(c) == 0) map.remove(c);
        }
        return map.isEmpty();
    }
}
