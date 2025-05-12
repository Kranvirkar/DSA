package com.scaler.dsa1.provatosoft;

import java.util.LinkedHashMap;
import java.util.Map;

/*
How to find the first non repeated character in the String?


*/
public class PfirstnonrepeatElement {
    public static void main(String[] args) {
        String str = "GeeksForGeeks";
        System.out.println("input "+str);
        firstNonRepeat(str);
    }

    private static void firstNonRepeat(String str) {
        int n =str.length();

        Map<Character,Integer> map =new LinkedHashMap<>();
        for(int i =0;i<n;i++){
           map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }

        for (Map.Entry<Character,Integer> tmp:map.entrySet()){
            if (tmp.getValue()==1){
                System.out.println("output "+tmp);
                break;
            }
        }
    }
}
