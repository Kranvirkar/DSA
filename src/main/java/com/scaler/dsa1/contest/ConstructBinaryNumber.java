package com.scaler.dsa1.contest;

public class ConstructBinaryNumber {

    /*Construct a binary number having A 1's ollowed by B 0's. Return the decimal value of that binary number
    input A=3,B=2
    ouput: 28*/
    public static void main(String[] args) {
        int A = 3;
        int B = 2;
        int result = constructBinaryNumber(A, B);
        System.out.println(result);  // Output: 28
    }

    public static int constructBinaryNumber(int A, int B) {
        // Construct the binary number as a string
        StringBuilder binaryString = new StringBuilder();

        // Append A 1's
        for (int i = 0; i < A; i++) {
            binaryString.append("1");
        }

        // Append B 0's
        for (int i = 0; i < B; i++) {
            binaryString.append("0");
        }

        // Convert the binary string to a decimal integer
        return Integer.parseInt(binaryString.toString(), 2);
    }
}
