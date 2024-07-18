package com.scaler.dsa1.array;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int index = 5;
        int element = 90;
        int sizeOfArray = 6;

        int[] initialValues = new int[]{1, 2, 3, 4, 5, 0};
        // Insert the element at the specified index
        insertAtIndex(initialValues, sizeOfArray, index, element);
    }
    public static void insertAtIndex(int arr[],int sizeOfArray,int index,int element)
    {
        int[] temp =new int[sizeOfArray-index]   ;
        System.out.println(temp.length);
        for(int i=index;i<sizeOfArray;i++){
            int j=0;
            temp[j++]=arr[i];

        }
        arr[index]=element;
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<temp.length;i++){
            arr[index++]=temp[i];
        }
    }

}
