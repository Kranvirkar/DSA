package com.scaler.dsa1.string;

public class LeftmostNonrepeatingElement {

    public static void main(String args[])
    {   String str = "geeksforgeeks";
        System.out.println("Index of leftmost non-repeating element:");
        System.out.println(nonRep(str));
    }

    public final static int CHAR=256;
    private static int nonRep(String str) {
        int[] count =new int[CHAR];
        for (int i = 0; i <str.length() ; i++) {
            count[str.charAt(i)]++;
        }
        for (int i = 0; i <str.length() ; i++) {
            if(count[str.charAt(i)]==1){
                return i;
            }
        }
        return -1;
    }
}
