package com.scaler.dsa1.thread.SynchronisedBlock;

public class SubstractCounter implements Runnable{

    Counter counter;
    SubstractCounter(Counter counter){
        this.counter=counter;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            counter.decrement();
        }
    }
}
