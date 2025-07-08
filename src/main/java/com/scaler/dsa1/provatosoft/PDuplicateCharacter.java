package com.scaler.dsa1.provatosoft;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class PDuplicateCharacter {
    public static void main(String[] args) {
        String input = "programming";
        Map<Character,Integer> map =new LinkedHashMap<>();

        for (Character ch:input.toCharArray()) {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character,Integer> tmp:map.entrySet()){
            if(tmp.getValue()>1){
                System.out.println(tmp.getKey());
            }
        }

    }
}
