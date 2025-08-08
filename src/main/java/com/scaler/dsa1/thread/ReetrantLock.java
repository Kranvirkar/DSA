package com.scaler.dsa1.thread;

import java.util.concurrent.locks.ReentrantLock;

public class ReetrantLock {
    private static int count =0;
    static ReentrantLock lock = new ReentrantLock();

    public static void increment(){
        lock.lock();
        try {
            count++;
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(()->{
            for (int i = 0; i < 100; i++) {
                increment();
            }
        });

        Thread t2 = new Thread(()->{
            for (int i = 0; i < 100; i++) {
                increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final counter: " + count); // Always 200
    }
}
