package com.scaler.dsa1.thread.counterMutex;

import java.util.concurrent.locks.Lock;

public class SubstractCounter implements Runnable{

    Counter counter;
    Lock lock;
    SubstractCounter(Counter counter,Lock lock){
        this.counter=counter;
        this.lock=lock;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            lock.lock();
            counter.decrement();
            lock.unlock();
        }
    }
}
