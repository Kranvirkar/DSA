package com.scaler.dsa1.thread.counter;

public class AddCounter implements Runnable{

    Counter counter;
    AddCounter(Counter counter){
        this.counter=counter;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 1000; i++) {
            counter.increment();
        }
    }
}
