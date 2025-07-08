package com.scaler.dsa1.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class CountAllOccurance {

    public static void main(String[] args) {
        String input = "HelloWorld";
        Map<String, Long> charCountMap;
        charCountMap = Arrays.stream(input.split(""))
                .collect(groupingBy(Function.identity(),counting()));

        System.out.println("char Count "+charCountMap);

        //duplicate
        List<String> duplicate = Arrays.stream(input.split(""))
                .collect(groupingBy(Function.identity(), counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(toList());
        System.out.println("Duplicate "+duplicate);


    //unique
    List<String> unique = Arrays.stream(input.split(""))
            .collect(groupingBy(Function.identity(), counting()))
            .entrySet().stream()
            .filter(e -> e.getValue() == 1)
            .map(Map.Entry::getKey)
            .collect(toList());
        System.out.println("unique "+unique);

        //first non-repeating element
        String nonRepeat = Arrays.stream(input.split(""))
                .collect(
                        groupingBy(Function.identity(), LinkedHashMap::new, counting())
                )
                .entrySet().stream()
                .filter(x -> x.getValue() == 1)
                .findFirst().get().getKey();
        System.out.println("nonRepeat "+nonRepeat);

    }

    }

