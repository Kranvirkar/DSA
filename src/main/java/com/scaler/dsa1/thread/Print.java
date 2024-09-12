package com.scaler.dsa1.thread;

public class Print implements Runnable{

    int number;

    Print(int number){
        this.number=number;
    }

    @Override
    public void run() {
        System.out.println("Thread "+number +" "+Thread.currentThread().getName());
    }
}
