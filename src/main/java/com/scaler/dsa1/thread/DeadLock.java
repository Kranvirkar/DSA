package com.scaler.dsa1.thread;

public class DeadLock {
    static class A{
        public synchronized void methodA(B b){
            System.out.println("Thread 1: locked A");
            try {
                Thread.sleep(100);
            }catch (Exception e){}
            b.last();
        }
        synchronized void last() {
            System.out.println("Inside A.last()");
        }
    }

    static class B{

        synchronized void methodB(A a){
            System.out.println("Thread 2: locked B");
            try {
                Thread.sleep(100);
            }catch (Exception e){}
            a.last();
        }

        synchronized void last() {
            System.out.println("Inside B.last()");
        }
    }

    public static void main(String[] args) {
        A a =new A();
        B b =new B();
        Thread t1 = new Thread(()-> a.methodA(b));
        Thread t2 = new Thread(()-> b.methodB(a));

        t1.start();
        t2.start();
    }
}
