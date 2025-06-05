package com.scaler.dsa1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class testmerge {
    public static void main(String[] args) {
        int[] a1={1,2,3,4,5};
        int[] a2={11,22,32};
        int[] nums = {127, 128, 129};

        Arrays.stream(nums)
                //.boxed()
                .forEach(n -> {
                   /* Integer i1 = Integer.valueOf(n);
                    Integer i2 = Integer.valueOf(n);*/

                   // Integer i1 = n;
                    Integer i2 = Integer.valueOf(n);
                    System.out.println("Value: " + n +
                            " | i1 == i2: " + (n == i2) );
                           // " | i1.equals(i2): " + n.equals(i2));
                });
    }

    private static Integer[] merge(Integer[] a1, Integer[] a2) {
        return  Stream.concat(Arrays.stream(a1), Arrays.stream(a2)).sorted(Comparator.reverseOrder()).toArray(Integer[]::new);
    }

}
