package com.scaler.dsa1.stack;

import java.util.Stack;

public class DoubleCharacterTrouble {

    public static String doubleCharacterTroubleUsingStack(String str){
        Stack<Character> stack =new Stack<>();
        int N=str.length();
        for (int i = N-1; i >=0 ; i--) {
            if (stack.isEmpty()) {
                stack.push(str.charAt(i));
            } else if (str.charAt(i)==stack.peek()) {
                stack.pop();
            }else {
                stack.push(str.charAt(i));
            }
        }

        StringBuilder stringBuilder=new StringBuilder();
        while (stack.size()>0){
            Character ch=stack.peek();
            stringBuilder.append(ch);
            stack.pop();
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String str="adebbecaacded";
        System.out.println("Before: "+str);
        System.out.println("After: "+doubleCharacterTroubleUsingStack(str));
    }


}
