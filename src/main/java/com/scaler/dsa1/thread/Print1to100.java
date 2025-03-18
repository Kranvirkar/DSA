package com.scaler.dsa1.thread;

import java.util.concurrent.Semaphore;


    class NumberPrinterSemaphore {
        private int number = 1;
        private final int limit = 100;
        private final Semaphore oddSemaphore = new Semaphore(1);
        private final Semaphore evenSemaphore = new Semaphore(0);

        public void printOdd() {
            while (true) {
                try {
                    oddSemaphore.acquire();
                    if (number > limit) {
                        evenSemaphore.release(); // Release to avoid deadlock
                        return;
                    }
                    System.out.println(Thread.currentThread().getName() + " -> " + number);
                    number++;
                    evenSemaphore.release();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }

        public void printEven() {
            while (true) {
                try {
                    evenSemaphore.acquire();
                    if (number > limit) {
                        oddSemaphore.release(); // Release to avoid deadlock
                        return;
                    }
                    System.out.println(Thread.currentThread().getName() + " -> " + number);
                    number++;
                    oddSemaphore.release();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public class Print1to100 {
        public static void main(String[] args) {
            NumberPrinterSemaphore printer = new NumberPrinterSemaphore();

            Thread t1 = new Thread(printer::printOdd);
            Thread t2 = new Thread(printer::printEven);
            Thread t3 = new Thread(printer::printOdd, "OddThread");

            t1.start();
            t2.start();
            t3.start();
        }
}
