package com.pluralsight.calcengine;


import org.w3c.dom.css.Counter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SharedDemo implements Runnable {
    private static final int MAX = 10;
    private Counter myCounter;

    public SharedDemo(Counter c) {
        this.myCounter = c;
    }

    @Override
    public void run() {
        for (int i = 0; i < MAX; i++)
        {
//            myCounter.increment();
        }

    }
}

    public class SharedCounter {
        public static void main(String[] args) {

//            ExecutorService executor = Executors.newFixedThreadPool(10);//creating a pool of 5 threads
//            for (int i = 0; i < 10; i++) {
//                Runnable task = new SharedDemo(100);
//                executor.execute(task);//calling execute method of ExecutorService
//            }
//            executor.shutdown();
//            while (!executor.isTerminated()) {
//            }
//
//            System.out.println("Finished all threads");
        }

    }

