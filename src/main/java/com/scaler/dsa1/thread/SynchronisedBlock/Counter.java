package com.scaler.dsa1.thread.SynchronisedBlock;

public class Counter {

    private int count;

    Counter(){
        this.count=0;
    }

    public void increment(){
        synchronized (this) {
            count++;
        }
    }

    public void decrement(){
        synchronized (this) {
            count--;
        }
    }

    public int getCounter() {
        return count;
    }
}
