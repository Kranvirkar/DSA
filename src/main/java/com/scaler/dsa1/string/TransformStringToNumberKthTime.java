package com.scaler.dsa1.string;

public class TransformStringToNumberKthTime {
    public static int getLucky(String s, int k) {
        StringBuilder number = new StringBuilder();
        while (k > 0) {
            int temp = 0;
            for (char x : stringToNumber(s).toCharArray()) {
                temp += x - '0';  // Sum the digits of the current number
            }
            number = new StringBuilder(String.valueOf(temp));  // Convert the sum back to a string
            k--;
        }
        return Integer.parseInt(number.toString());  // Return the final result as an integer
    }

    public static String stringToNumber(String s){
        char[] ch =s.toCharArray();
        StringBuilder str =new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            str.append(ch[i] - 'a' + 1);
        }
        return  str.toString();
    }

    public static void main(String[] args) {
        System.out.println(getLucky("abc",2));
    }
}
