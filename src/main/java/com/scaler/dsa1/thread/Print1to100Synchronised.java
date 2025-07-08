package com.scaler.dsa1.thread;

class NumberPrint{
    private int number =1;
    private int limit =100;

    public synchronized void printOdd(){
        while (number<=limit){
            while (number%2!=0){
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            if(number<=limit) {
                System.out.println(Thread.currentThread().getName() + "->" + number);
                number++;
                notify();
            }
        }
    }
    public synchronized void printEven(){
        while (number<=limit){
            while (number%2==0){
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            if(number<=limit) {
                System.out.println(Thread.currentThread().getName() + "->" + number);
                number++;
                notify();
            }
        }
    }
}

public class Print1to100Synchronised {
    public static void main(String[] args) {
        NumberPrint print =new NumberPrint();

        Thread even =new Thread(print::printEven);
        Thread odd =new Thread(print::printOdd);
        even.start();
        odd.start();
    }
}
