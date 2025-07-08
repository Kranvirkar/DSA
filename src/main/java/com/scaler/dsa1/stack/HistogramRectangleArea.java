package com.scaler.dsa1.stack;

import java.util.Arrays;
import java.util.Stack;

public class HistogramRectangleArea {
    public static void main(String[] args) {
        int[] heights = {3,2,5,7,4,6,5,2,3,1,5,6,4,3,5,6,4,1};
        System.out.println("Largest Rectangle Area: " + largestRectangleArea(heights));
        System.out.println("Largest Rectangle Area: " + largestRectangleAreaScaler(heights));
    }

    private static int largestRectangleAreaScaler(int[] arr) {
        int N =arr.length;
        int[] left =new int[N];
        int[] right =new int[N];
        Stack<Integer> stackLeft= new Stack<>();
        for (int i = 0; i < N; i++) {
            while (!stackLeft.isEmpty() && arr[stackLeft.peek()]>=arr[i]){
                stackLeft.pop();
            }
            if (!stackLeft.isEmpty()){
                left[i]=stackLeft.peek();
            }else {
                left[i]=-1;
            }
            stackLeft.push(i);
        }

        Stack<Integer> stackRight= new Stack<>();
        for (int i = N-1; i >=0; i--) {
            while (!stackRight.isEmpty() && arr[stackRight.peek()]>=arr[i]){
                stackRight.pop();
            }
            if (!stackRight.isEmpty()){
                right[i]=stackRight.peek();
            }else {
                right[i]=N;
            }
            stackRight.push(i);
        }
        int ans=0;
        for (int i = 0; i < N; i++) {
            int p1=left[i],p2=right[i];
            ans=Math.max(ans,arr[i]*(p2-p1-1));
        }
        return ans;
    }

    private static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        // Iterate through each bar
        for (int i = 0; i < n; i++) {
            // If the current bar is lower than the one at the top of the stack
            while (!stack.isEmpty() && heights[i] < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }

        // Pop the remaining bars in the stack
        while (!stack.isEmpty()) {
            int height = heights[stack.pop()];
            int width = stack.isEmpty() ? n : n - stack.peek() - 1;
            maxArea = Math.max(maxArea, height * width);
        }

        return maxArea;
    }
    
}
