package com.scaler.dsa1.thread.excutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 100000; i++) {
            executorService.execute(new Print(i));
        }
    }
}
