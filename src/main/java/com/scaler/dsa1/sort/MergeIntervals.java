package com.scaler.dsa1.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
       Arrays.sort(intervals,(a,b)->
           Integer.compare(a[0],b[0])
       );
       List<int[]> list =new ArrayList<>();

       for (int[] interval:intervals){
           if (list.isEmpty() || list.get(list.size()-1)[1]<interval[0]){
               list.add(interval);
           }else{
               list.get(list.size()-1)[1]=Math.max(list.get(list.size()-1)[1],interval[1]);
           }
       }
       return list.toArray(new int[list.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals1 = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] result1 = merge(intervals1);
        System.out.println("Merged Intervals:");
        for (int[] interval : result1) {
            System.out.println(Arrays.toString(interval));
        }

        int[][] intervals2 = {{1, 4}, {4, 5}};
        int[][] result2 = merge(intervals2);
        System.out.println("Merged Intervals:");
        for (int[] interval : result2) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
