package com.scaler.dsa1.stack;

import java.util.Stack;

public class InfixToPostfix {

    // Method to check if a character is an operator
    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^';
    }

    // Method to get the precedence of an operator
    private static int getPrecedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;  // Low precedence
            case '*':
            case '/':
                return 2;  // Higher precedence
            case '^':
                return 3;  // Highest precedence (exponentiation)
        }
        return -1;
    }

    // Method to convert an infix expression to a postfix expression
    public static String infixToPostfix(String infix) {
        StringBuilder result = new StringBuilder();  // To store the postfix expression
        Stack<Character> stack = new Stack<>();      // Stack to hold operators

        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);

            // If the character is an operand, add it to the result
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }
            // If the character is a left parenthesis, push it onto the stack
            else if (c == '(') {
                stack.push(c);
            }
            // If the character is a right parenthesis, pop until '(' is encountered
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();  // Pop the left parenthesis '('
            }
            // If the character is an operator
            else if (isOperator(c)) {
                // Pop operators from the stack to the result if they have higher or equal precedence
                while (!stack.isEmpty() && getPrecedence(c) <= getPrecedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c);  // Push the current operator onto the stack
            }
        }

        // Pop all remaining operators from the stack
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String infixExpression = "A+B*(C^D-E)";
        System.out.println("Infix: " + infixExpression);
        System.out.println("Postfix: " + infixToPostfix(infixExpression));
    }
}
