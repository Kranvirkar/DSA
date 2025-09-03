package com.scaler.dsa1.stream;

import java.util.*;
import java.util.stream.Collectors;

public class Collect {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Kiran", "John", "Alex");
        List<String> fruits = Arrays.asList("apple", "banana", "apple", "orange");
        List<String> result = list.stream()
                .filter(name -> name.length() > 4)
                .collect(Collectors.toList());

        // [Kiran]
        System.out.println("name with length more than 4 "+result);

        Set<String> uniqueElement = fruits.stream()
                .collect(Collectors.toSet());
        Set<String> uniqueElementOrder = fruits.stream()
                .collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println("unique Element: "+uniqueElement);
        System.out.println("unique Element: "+uniqueElementOrder);

        Map<String, Integer> namesWithLength = list.stream()
                .collect(Collectors.toMap(
                        name -> name,
                        name -> name.length()));

        System.out.println("Map name and length: "+namesWithLength);

        String strJoining = fruits.stream()
                .collect(Collectors.joining(","));

        System.out.println("string joining: "+strJoining);

        IntSummaryStatistics intSummaryStatistics = list.stream()
                .mapToInt(String::length)
                .summaryStatistics();

        System.out.println("Summary Statistics: "+intSummaryStatistics);
    }
}
