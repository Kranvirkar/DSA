package com.scaler.dsa1.string;

public class ConcatenationZigZag {

    /*
    Input:
    str = "ABCDEFGH"
    n = 2
    Output: "ACEGBDFH"
    Explanation:
    Let us write input string in
    Zig-Zag fashion in 2 rows.
    A   C   E   G
      B   D   F   H
    Now concatenate the two rows and ignore
    spaces in every row. We get "ACEGBDFH"

Input:
str = "GEEKSFORGEEKS"
n = 3
Output: GSGSEKFREKEOE
Explanation:
Let us write input string in
Zig-Zag fashion in 3 rows.
G       S       G       S
  E   K   F   R   E   K
    E       O       E
Now concatenate the two rows and ignore spaces
in every row. We get "GSGSEKFREKEOE"
    */

    class Solution {
        public static String convert(String str, int n) {
            if (n == 1) return str;

            StringBuilder result = new StringBuilder();
            int len = str.length();

            // Step size for each full cycle
            int cycleLen = 2 * n - 2;

            for (int row = 0; row < n; row++) {
                for (int i = row; i < len; i += cycleLen) {
                    result.append(str.charAt(i));  // Add character from the row

                    int secondIdx = i + cycleLen - 2 * row;
                    if (row != 0 && row != n - 1 && secondIdx < len) {
                        result.append(str.charAt(secondIdx));
                    }
                }
            }
            return result.toString();
        }
        public static String convert1(String str, int n) {
            if (n == 1) return str;  // If n = 1, return the original string (no zig-zag effect)

            StringBuilder[] rows = new StringBuilder[n];
            for (int i = 0; i < n; i++) {
                rows[i] = new StringBuilder();  // Initialize StringBuilder for each row
            }

            int row = 0;
            boolean down = true;  // Direction flag

            for (char ch : str.toCharArray()) {
                rows[row].append(ch);  // Add character to the current row

                if (row == 0) down = true;  // Change direction to down
                else if (row == n - 1) down = false;  // Change direction to up

                row += down ? 1 : -1;  // Move to the next row accordingly
            }

            // Concatenate all rows
            StringBuilder result = new StringBuilder();
            for (StringBuilder sb : rows) {
                result.append(sb);
            }

            return result.toString();
        }
        public static void main(String[] args) {
            System.out.println(convert("ABCDEFGH", 2));   // Output: "ACEGBDFH"
            System.out.println(convert("GEEKSFORGEEKS", 3));  // Output: "GSGSEKFREKEOE"
        }
    }

}
