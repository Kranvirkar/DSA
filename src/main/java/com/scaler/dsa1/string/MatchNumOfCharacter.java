package com.scaler.dsa1.string;

import java.util.HashMap;
import java.util.Map;

public class MatchNumOfCharacter {

    public static void main(String[] args) {
        String str1="bcbcabb";
        String str2="caebaadc";
        System.out.println(matchCharacter(str1,str2));
    }

    public static int matchCharacter(String str1, String str2) {
        int count=0;
        Map<Character,Integer> hm1=new HashMap<>();
        Map<Character,Integer> hm2=new HashMap<>();
        int N=str1.length(),M=str2.length();
        for (int i = 0; i < N; i++) {
            if (hm1.containsKey(str1.charAt(i))){
                int freq=hm1.get(str1.charAt(i));
                hm1.put(str1.charAt(i),freq+1);
            }else {
                hm1.put(str1.charAt(i),1);
            }
        }
        for (int i = 0; i < M; i++) {
            char ch = str2.charAt(i);
            if (hm2.containsKey(ch)){
                int freq=hm2.get(ch);
                hm2.put(ch,freq+1);
            }else {
                hm2.put(ch,1);
            }
            if (hm1.containsKey(ch) && hm2.get(ch)<=hm1.get(ch)){
                count++;
            }
        }

        return count;
    }
}
