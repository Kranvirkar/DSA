package com.scaler.dsa1.thread.Synchronised;

public class Counter {

    private int count;

    Counter(){
        this.count=0;
    }

    public synchronized void increment(){
        count++;
    }

    public synchronized void decrement(){
        count--;
    }

    public int getCounter() {
        return count;
    }
}
