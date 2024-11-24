package com.scaler.dsa1.thread.counterMutex;

public class Counter {

    private int count;

    Counter(){
        this.count=0;
    }

    public void increment(){
        count++;
    }

    public void decrement(){
        count--;
    }

    public int getCounter() {
        return count;
    }
}
