package com.scaler.dsa1.array;

import java.lang.reflect.Method;
import java.util.Arrays;

public class ArrayinsertAtIndex {
    public static void main(String[] args) {
        int index = 2;
        int element = 90;
        int sizeOfArray = 6;

        int[] initialValues = new int[]{1, 2, 3, 4, 5, 0};
        System.out.println("Original Array: "+Arrays.toString(initialValues));

        Class objClass = ArrayinsertAtIndex.class;
        Method[] methods =objClass.getMethods();
        for (Method method:methods){
            System.out.println(method.getName());
        }
        // Insert the element at the specified index
        insertAtIndex(initialValues, sizeOfArray, index, element);
    }

    private static void insertAtIndex(int[] initialValues, int sizeOfArray, int index, int element) {
        for (int i = sizeOfArray-1; i >index ; i--) {
            initialValues[i]=initialValues[i-1];
        }
        initialValues[index]=element;
        System.out.println("Modified array: "+Arrays.toString(initialValues));
    }
}
