package com.scaler.dsa1.thread.counterMutex;

import java.util.concurrent.locks.Lock;

public class AddCounter implements Runnable{

    Counter counter;
    Lock lock;
    AddCounter(Counter counter,Lock lock){
        this.counter=counter;
        this.lock =lock;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 1000; i++) {
            lock.lock();
            counter.increment();
            lock.unlock();
        }
    }
}
