package com.scaler.dsa1.stack;

import java.util.Arrays;
import java.util.Stack;

public class LeftNearSmallestElement {
    public static void main(String[] args) {
        int[] arr = {5,8,11,14,7,10,13,6,9,10,2,5};
        int[] result = firstSmallerOnLeft(arr);
        int[] ans = firstSmallerOnLeftOptimised(arr);

        System.out.println("Original array: "+ Arrays.toString(arr));

        System.out.println("\nFirst smaller element on the left: "+Arrays.toString(result));

        System.out.println("\nFirst smaller element on the left optimised: "+Arrays.toString(ans));

    }

    private static int[] firstSmallerOnLeft(int[] arr) {
        int N =arr.length;
        int[] result =new int[N];
        Arrays.fill(result,-1);
        for (int i = 1; i < N; i++) {
            for (int j = i-1; j >=0 ; j--) {
                if (arr[i]>arr[j]){
                    result[i]=arr[j];
                    break;
                }
            }
        }
        return result;
    }

    private static int[] firstSmallerOnLeftOptimised(int[] arr) {
        int N =arr.length;
        int[] result =new int[N];
        Arrays.fill(result,-1);
        Stack<Integer> stack= new Stack<>();
        for (int i = 0; i < N; i++) {
            while (!stack.isEmpty() && stack.peek()>=arr[i]){
                stack.pop();
            }
            if (!stack.isEmpty()){
                result[i]=stack.peek();
            }
            stack.push(arr[i]);

        }
        return result;
    }
}
