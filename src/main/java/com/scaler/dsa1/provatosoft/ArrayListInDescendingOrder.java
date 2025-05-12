package com.scaler.dsa1.provatosoft;

import java.util.*;

public class ArrayListInDescendingOrder {
    public static void main(String[] args) {
        //1. Using Collections.sort() with Collections.reverseOrder()
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 1, 9, 3, 7));
        System.out.println("Before reverse arraylist "+list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Using Collections.sort() with Collections.reverseOrder() "+list);

        //2. Using List.sort() with Comparator.reverseOrder()

        list.sort(Comparator.reverseOrder());
        System.out.println("Descending: " + list);

        //3. using Stream api
        List<Integer> list1 = list.stream().sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("Stream api "+list1);
    }
}
