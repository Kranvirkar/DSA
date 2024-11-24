package com.scaler.dsa1.thread;

public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            Thread t1 = new Thread(new Print(i));
            t1.start();
        }
    }
}
