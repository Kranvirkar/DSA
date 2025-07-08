package com.scaler.dsa1.string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithDistictChar {

    public static void main(String[] args) {
    String str ="abaceafe";
        System.out.println(longestsubstring(str));
        System.out.println(optimisedSubString(str));
    }

    private static int optimisedSubString(String str) {
        int N=str.length();
        int ans=0;
        Set<Character> set =new HashSet<>();
        int i=0,j=0;
        while (j<N){
            if (set.contains(str.charAt(j))==false){
                set.add(str.charAt(j));
                ans=Math.max(ans,set.size());
                j++;
            }else {
                set.remove(str.charAt(i));
                i++;
            }
        }
        return ans;
    }

    private static int longestsubstring(String str) {
        int N=str.length();
        int ans=0;
        for (int i = 0; i < N; i++) {
            HashSet<Character> hs =new HashSet<>();
            for (int j = i; j <N ; j++) {
                if (hs.contains(str.charAt(j))==false){
                    hs.add(str.charAt(j));
                }else {
                    break;
                }
            }
            ans=Math.max(ans,hs.size());
        }
        return ans;
    }
}
