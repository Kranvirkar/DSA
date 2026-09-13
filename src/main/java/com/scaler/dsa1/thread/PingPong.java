package com.scaler.dsa1.thread;

public class PingPong {
    public static boolean flag=true;
    public static final int count=5;

    public synchronized void  pingPrint() throws InterruptedException {
        while (!flag){
            wait();
        }
        System.out.println("Ping");
        flag=false;
        notifyAll();
    }

    public synchronized void  pongPrint() throws InterruptedException {
        while (flag){
            wait();
        }
        System.out.println("Pong");
        flag=true;
        notifyAll();
    }

    public static void main(String[] args) {
        PingPong pingPong = new PingPong();
        Thread t1 = new Thread(()->{
            for (int i = 0; i < count; i++) {
                try {
                    pingPong.pingPrint();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        );

        Thread t2 = new Thread(()->{
            for (int i = 0; i < count; i++) {
                try {
                    pingPong.pongPrint();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        );
        t1.start();
        t2.start();
    }
}
