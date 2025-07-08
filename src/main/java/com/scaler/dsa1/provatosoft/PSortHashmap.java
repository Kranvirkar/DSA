package com.scaler.dsa1.provatosoft;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class PSortHashmap {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(33, "Z");
        map.put(99, "I");
        map.put(22, "A");
        map.put(55, "B");
        map.put(88, "X");
        map.put(44, "M");

        //1.Using TreeMap (Automatically sorts by keys)
        Map<Integer, String> sortedByKey = new TreeMap<>(map);
        System.out.println("Using TreeMap sorted "+sortedByKey);

        //2. Using Stream + collect(Collectors.toMap())
        LinkedHashMap<Integer, String> collect = map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new));
        System.out.println("Stream and collect "+collect);


    }
}
