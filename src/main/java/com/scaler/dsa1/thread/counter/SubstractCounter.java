package com.scaler.dsa1.thread.counter;

public class SubstractCounter implements Runnable{

    Counter counter;
    SubstractCounter(Counter counter){
        this.counter=counter;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 1000; i++) {
            counter.decrement();
        }
    }
}
