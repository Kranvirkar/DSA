package com.scaler.dsa1.hashing;
import java.util.HashMap;
import java.util.Map;

class MyKey {
        private String key;

        public MyKey(String key) {
            this.key = key;
        }

        @Override
        public int hashCode() {
            // Force all objects to have the same hash code to simulate collision
            return 42;
        }

        @Override
        public boolean equals(Object obj) {
            // Proper equals method to differentiate between different keys
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            MyKey other = (MyKey) obj;
            return this.key.equals(other.key);
        }

        @Override
        public String toString() {
            return key;
        }
    }

public class Collision {
        public static void main(String[] args) {
            Map<MyKey, String> map = new HashMap<>();

            MyKey key1 = new MyKey("A");
            MyKey key2 = new MyKey("A");
            MyKey key3 = new MyKey("C");

            map.put(key1, "Apple");
            map.put(key2, "Banana");
            map.put(key3, "Cherry");

            for (Map.Entry<MyKey, String> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " => " + entry.getValue());
            }
        }
    }


