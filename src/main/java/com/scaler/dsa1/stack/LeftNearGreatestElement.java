package com.scaler.dsa1.stack;

import java.util.Arrays;
import java.util.Stack;

public class LeftNearGreatestElement {
    public static void main(String[] args) {
        int[] arr = {11,8,6,2,10,7,4,1};
        int[] result = firstGreatestOnLeft(arr);
        int[] ans = firstGreatestOnLeftOptimised(arr);

        System.out.println("Original array: "+ Arrays.toString(arr));

        System.out.println("\nFirst Greatest element on the left: "+Arrays.toString(result));

        System.out.println("\nFirst Greatest element on the left optimised: "+Arrays.toString(ans));

    }

    private static int[] firstGreatestOnLeft(int[] arr) {
        int N =arr.length;
        int[] result =new int[N];
        Arrays.fill(result,-1);
        for (int i = 1; i < N; i++) {
            for (int j = i-1; j >=0 ; j--) {
                if (arr[i]<arr[j]){
                    result[i]=arr[j];
                    break;
                }
            }
        }
        return result;
    }

    private static int[] firstGreatestOnLeftOptimised(int[] arr) {
        int N =arr.length;
        int[] result =new int[N];
        Arrays.fill(result,-1);
        Stack<Integer> stack= new Stack<>();
        for (int i = 0; i < N; i++) {
            while (!stack.isEmpty() && stack.peek()<=arr[i]){
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
