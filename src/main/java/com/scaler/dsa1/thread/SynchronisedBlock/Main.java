package com.scaler.dsa1.thread.SynchronisedBlock;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Counter counter =new Counter();
        Thread t1 =new Thread(new AddCounter(counter));
        Thread t2 =new Thread(new Thread(new SubstractCounter(counter)));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count "+counter.getCounter());
    }
}
