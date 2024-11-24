package com.scaler.dsa1.string;

public class Permutation {
    

    public static void main(String[] args) {
        String str1 = "anat";
        String str2 = "tana";
        System.out.println(permutationEachOther(str1,str2));
    }

    private static boolean permutationEachOther(String str1, String str2) {
        int count =MatchNumOfCharacter.matchCharacter(str1,str2);
        int N =str1.length();
        if (count==N){
            return true;
        }
        return false;
    }
}
