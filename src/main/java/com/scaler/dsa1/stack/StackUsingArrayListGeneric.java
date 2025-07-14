package com.scaler.dsa1.stack;

import java.util.ArrayList;
import java.util.List;


public class StackUsingArrayListGeneric<T> {

    private final List<T> al = new ArrayList<>();

    public void push(T data) {
        al.add(data);
    }

    public T pop() {
        if (al.isEmpty()) {
            throw new RuntimeException("Stack is empty. Cannot pop.");
        }
        T result = al.get(al.size() - 1);
        al.remove(al.size() - 1);
        return result;
    }

    public T peek() {
        if (al.isEmpty()) {
            throw new RuntimeException("Stack is empty. Cannot peek.");
        }
        return al.get(al.size() - 1);
    }

    public boolean isEmpty() {
        return al.isEmpty();
    }

    public int size() {
        return al.size();
    }
        public static void main(String[] args) {
            StackUsingArrayListGeneric<String> stringStack = new StackUsingArrayListGeneric<>();
            stringStack.push("Hello");
            stringStack.push("World");
            System.out.println(stringStack.peek()); // World
            System.out.println(stringStack.pop());  // World
            System.out.println(stringStack.peek()); // Hello

            StackUsingArrayListGeneric<Integer> intStack = new StackUsingArrayListGeneric<>();
            intStack.push(10);
            intStack.push(20);
            System.out.println(intStack.peek()); // 20
            System.out.println(intStack.pop());  // 20
            System.out.println(intStack.size()); // 1
        }
    }


