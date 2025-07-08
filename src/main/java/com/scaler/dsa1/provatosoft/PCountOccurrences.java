package com.scaler.dsa1.provatosoft;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
Write a java program to count occurrences of each character in String in
java. If the String is
"Java Hungry" then the answer should be
{ =1, a=2, r=1, u=1, v=1, g=1, H=1, y=1, J=1, n=1}


*/
public class PCountOccurrences {
    public static void main(String[] args) {
        String input = "Java Hungry";
        System.out.println("Input "+input);
        System.out.println("usingHshMap() "+usingHashMap(input));
        System.out.println("usingStreamApi() "+usingStreamApi(input));
    }

    private static Map<Character, Long> usingStreamApi(String input) {
        return input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    private static Map<Character,Integer>  usingHashMap(String input) {
        Map<Character,Integer> map =new HashMap<>();
        for (Character ch :input.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        return map;
    }
}
