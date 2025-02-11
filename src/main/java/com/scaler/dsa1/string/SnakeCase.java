package com.scaler.dsa1.string;

public class SnakeCase {

    /*
    Input:
    N = 14
    S = "Geeks ForGeeks"
    Output: "geeks_forgeeks"
    Explanation: All upper case characters are
    converted to lower case and the whitespace
    characters are replaced with underscore '_'.
    */
    public static void main(String[] args) {
        System.out.println(snakeCase(14, "Geeks ForGeeks"));  // Output: "geeks_forgeeks"
        System.out.println(snakeCase(21, "Here comes the garden"));  // Output: "here_comes_the_garden"
    }

    private static String snakeCase(int n, String S) {
        StringBuilder sb =new StringBuilder();

        for(int i=0;i<n;i++){
            char ch = S.charAt(i);
            if(ch==' '){
                sb.append('_');
            }else{
                sb.append(Character.toLowerCase(ch));
            }
        }
        return sb.toString();
    }
}
