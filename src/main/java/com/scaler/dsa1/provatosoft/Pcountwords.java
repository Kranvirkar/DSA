package com.scaler.dsa1.provatosoft;

import java.util.Arrays;

public class Pcountwords {
    public static void main(String[] args) {
        String str ="Hello world in java";
        System.out.println("input "+str);
        System.out.println("Normal "+countWord(str));
        System.out.println("Stream "+countWordStream(str));
        System.out.println("replace white space "+str.replace(" ",""));
    }

    private static int countWord(String str) {
        String[] count =str.trim().split("\\s");
        return count.length;
    }

    private static int countWordStream(String str) {
        return (int) Arrays.stream(str.trim().split("\\s"))
                .filter(word -> !word.isEmpty())
                .count();
    }
}
