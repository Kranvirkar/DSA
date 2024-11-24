package com.scaler.dsa1.string;

public class LongestCommonPrefix {

        public static String longestCommonPrefix(String[] strs) {
            // Step 1: Handle edge cases
            if (strs == null || strs.length == 0) {
                return ""; // No common prefix
            }

            // Step 2: Initialize prefix with the first string
            String prefix = strs[0];

            // Step 3: Compare with each subsequent string
            for (int i = 1; i < strs.length; i++) {
                // While the prefix doesn't match the current string, shorten the prefix
                while (strs[i].indexOf(prefix) != 0) {
                    prefix = prefix.substring(0, prefix.length() - 1);
                    // If prefix becomes empty, no common prefix exists
                    if (prefix.isEmpty()) {
                        return "";
                    }
                }
            }

            // Step 4: Return the final common prefix
            return prefix;
        }

        public static void main(String[] args) {
            // Test cases
            System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"})); // Output: "fl"
            System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"}));    // Output: ""
            System.out.println(longestCommonPrefix(new String[]{"interstellar", "internet", "internal"})); // Output: "int"
        }
    }

