package com.scaler.dsa1.stack;

import java.util.ArrayList;
import java.util.List;

public class StackUsingArrayList {

    List<Integer> al =new ArrayList<>();

    public void push(int data){
        al.add(data);
    }

    public int pop(){
        if (al.isEmpty()) {
            throw new RuntimeException("Stack is empty. Cannot pop.");
        }
        int result =al.get(al.size()-1);
        al.remove(al.size()-1);
        return result;
    }

    public int peek(){
        if (al.isEmpty()) {
            throw new RuntimeException("Stack is empty. Cannot pop.");
        }
        int result =al.get(al.size()-1);
        return result;
    }

    public boolean isempty(){
        return al.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingArrayList stack = new StackUsingArrayList();
        stack.push(5);
        stack.push(10);
        System.out.println(stack.peek()); // 10
        System.out.println(stack.pop());  // 10
        System.out.println(stack.peek()); // 5
        System.out.println(stack.isempty()); // false
        stack.pop();
        System.out.println(stack.isempty()); // true
    }


}
