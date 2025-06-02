package com.scaler.dsa1.memoryleak;

import java.util.ArrayList;
import java.util.List;

public class MemoryLeakDemo {

    private static final List<Object> memoryLeakList = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            Object data = new byte[1024 * 1024]; // 1 MB object
            memoryLeakList.add(data); // retains reference, never released
            System.out.println("Added 1MB, total objects: " + memoryLeakList.size());

            try {
                Thread.sleep(100); // delay to see growth over time
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

