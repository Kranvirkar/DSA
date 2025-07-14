package com.scaler.dsa1.stack;

import java.util.*;

public class BalancedParenthesis {

    public static void main(String[] args)
    {
        String expr = "([{}])";

        // Function call
        if (areBracketsBalanced1(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }

    private static boolean areBracketsBalanced(String expr) {
        Deque<Character> dq=new ArrayDeque<>();
        for (int i=0;i<expr.length();i++){
            char ch =expr.charAt(i);
            if(ch =='{' || ch =='('|| ch =='['){
                dq.push(ch);
                continue;
            }
            if (dq.isEmpty()){
                return false;
            }
            char check;
            switch (ch){
                case ')':
                    check=dq.pop();
                    if (check == '}' || check == ']'){
                        return false;
                    }
                    break;
                case '}':
                    check=dq.pop();
                    if (check == ')' || check == ']'){
                        return false;
                    }
                    break;
                case ']':
                    check=dq.pop();
                    if (check == '}' || check == ')'){
                        return false;
                    }
                    break;
            }
        }
        return (dq.isEmpty());
    }

    private static boolean areBracketsBalanced1(String expr) {
        Deque<Character> stack =new ArrayDeque<>();
        Map<Character,Character> bracketPairs=Map.of(
                ')', '(',
                '}', '{',
                ']', '['
        );

        for (char ch : expr.toCharArray()){
            if (bracketPairs.containsValue(ch)) {
                // Opening bracket
                stack.push(ch);
            } else if (bracketPairs.containsKey(ch)) {
                // Closing bracket
                if (stack.isEmpty() || stack.pop() != bracketPairs.get(ch)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }


}
