package com.pluralsight.calcengine.RunableAndThreads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadRunnable {
    private static final int NTHREDS = 10;



    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(NTHREDS);
        for (int i = 0; i < 500; i++) {
            Runnable task = new RunnableInterface(10000000L + i);
            executor.execute(task);
            // This will make the executor accept no new threads
            // and finish all existing threads in the queue
            executor.shutdown();
            // Wait until all threads are finish
//            executor.awaitTermination();
            System.out.println("Finished all threads");
        }


//            callingThreadDirectly();
    }

    private static void callingThreadDirectly() {
        // We will store the threads so that we can check if they are done
        List<Thread> threads = new ArrayList<Thread>();
        // We will create 500 threads
        for (int i = 0; i < 50; i++) {
            Runnable task = new RunnableInterface(10000000L + i);
            Thread worker = new Thread(task);
            // We can set the name of the thread
            worker.setName(String.valueOf(i));
            // Start the thread, never call method run() direct
            worker.start();
            // Remember the thread for later usage
            threads.add(worker);
        }
        int running=0;
        do {
            running=0;
            for (Thread thread:threads)
            {
                if (thread.isAlive()){
                    running++;
                }
            }
            System.out.println("We have " + running + " running threads. ");
        }while (running>0);
    }
}