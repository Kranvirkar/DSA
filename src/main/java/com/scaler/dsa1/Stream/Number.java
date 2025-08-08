package com.scaler.dsa1.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Number {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,7,5,89,65,43,23,22);

        Consumer<Integer> consumer =t -> System.out.print(t+" ");
        Predicate<Integer> predicate = tm-> tm%2==0;

        //list.forEach(consumer);
        List<Integer> l1 =new ArrayList<>();
        l1=list.stream().filter(predicate).collect(Collectors.toList());
        //System.out.println(l1);
        list.stream().sorted(Comparator.reverseOrder()).forEach(t-> System.out.print(t+" "));
    }
}
