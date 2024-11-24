package com.scaler.dsa1.thread.counterMutex;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Counter counter =new Counter();
        Lock lock =new ReentrantLock();
        Thread t1 =new Thread(new AddCounter(counter,lock));
        Thread t2 =new Thread(new Thread(new SubstractCounter(counter,lock)));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count "+counter.getCounter());
    }
}
