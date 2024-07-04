package com.scaler.dsa1.array;

public class ReverseArray {
    public static void main(String args[]) {

        int arr[] = {1, 2, 3, 4, 5, 6};
        printArray(arr);
        System.out.print("Reversed array is \n");
        printArray(rvereseArray(arr));

    }

    private static int[] rvereseArray(int[] arr) {
        int start =0,end =arr.length-1;
        while (start<end){
            int temp =arr[start];
            arr[start] =arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }

    static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }



}
