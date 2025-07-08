package com.scaler.dsa1.provatosoft;

import java.util.*;

public class PIteratorOnHashMap {

    public static void main(String[] args) {
        // Create sample HashMap
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        System.out.println("1. For-each loop on entrySet()");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("\n2. keySet() with Iterator");
        Iterator<Integer> keyIterator = map.keySet().iterator();
        while (keyIterator.hasNext()) {
            Integer key = keyIterator.next();
            System.out.println(key + " : " + map.get(key));
        }

        System.out.println("\n3. entrySet() as List with index-based for loop");
        List<Map.Entry<Integer, String>> entryList = new ArrayList<>(map.entrySet());
        for (int i = 0; i < entryList.size(); i++) {
            Map.Entry<Integer, String> entry = entryList.get(i);
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("\n4. entrySet() with Iterator");
        Iterator<Map.Entry<Integer, String>> entryIterator = map.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<Integer, String> entry = entryIterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
