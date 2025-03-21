package main;

import main.Main.PrintNumber.ThreadT1;
import main.Main.PrintNumber.ThreadT2;

public class Main {

    public static void main(String[] args) {
        // Create an instance of PrintNumber to access the inner threads
        PrintNumber printNumber = new PrintNumber();
        
        // Create and start the threads
        ThreadT1 threadT1 = printNumber.new ThreadT1();
        ThreadT2 threadT2 = printNumber.new ThreadT2();
        
        threadT1.start();  // Start the even-number printing thread
        threadT2.start();  // Start the odd-number printing thread
    }

    public static class PrintNumber {
        private static final Object lock = new Object();
        private static int starting = 1;

        public class ThreadT2 extends Thread {
            @Override
            public void run() {
                while (starting <= 20) {
                    synchronized (lock) {
                        if (starting % 2 != 0) {
                            System.out.println(starting + " " + Thread.currentThread());
                            starting++;
                            lock.notify();
                        } else {
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }

        public class ThreadT1 extends Thread {
            @Override
            public void run() {
                while (starting <= 20) {
                    synchronized (lock) {
                        if (starting % 2 == 0) {
                            System.out.println(starting + " " + Thread.currentThread());
                            starting++;
                            lock.notify();
                        } else {
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }
    }
}
