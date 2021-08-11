package com.pluralsight.calcengine;

import java.util.Arrays;
import java.util.Random;

public class MaxValue {
    public static int maxValue;
    public static int a[];
    public  MaxValue(){
        this.createArray();
    }
//that generate random number
    public void createArray() {
        a = new int[10000];
        for (int i = 0; i < a.length; i++) {
            int value = new Random().nextInt();
            a[i] = value;
        }

    }
    public  void serialProcessing(){
        long startTime = System.nanoTime();
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > maxValue)
                maxValue = a[i];
        }
        long endTime = System.nanoTime();
        System.out.println("single processing: Max Value: " + maxValue + ", Time: " + (endTime - startTime));

    }
    public void ParallelProcessing() throws InterruptedException {
        this.execute();
    }
    public void execute() throws InterruptedException {
        long startTime = System.nanoTime();
        maxValue = 0;
        MaxValueThread[] threads = new MaxValueThread[4];
        int chunkSize = a.length / 4; // 2500
        for (int k = 0; k < threads.length; k ++)
        {
            int startIndex = chunkSize * k;
            int endIndex = startIndex + chunkSize;
            threads[k] = new MaxValueThread(startIndex, endIndex);
            threads[k].start();
        }
        for (int k = 0; k < threads.length; k ++)
            threads[k].join();
        long endTime = System.nanoTime();
        System.out.println("parallel processing: Max Value: " + maxValue + ", Time: " + (endTime - startTime));
    }

    public void executeSplit() throws InterruptedException {
        long startTime = System.nanoTime();
        maxValue = 0;
        MaxValueThreadSplit[] threads = new MaxValueThreadSplit[4];
        int chunkSize = a.length / 4;
        for (int i = 0; i < threads.length; i++) {
            int[] b = new int[chunkSize];//new array
            for (int j = (i * chunkSize); j < (i * chunkSize) + chunkSize; i++) {
                int innerArrayIndex = j - (i * chunkSize);
                b[innerArrayIndex] = a[j];
            }
            threads[i] = new MaxValueThreadSplit(b);
            threads[i].start();
        }
        for (int k = 0; k < threads.length; k++)
            threads[k].join();
        long endTime = System.nanoTime();
        System.out.println("Execute Split: Max Value: " + maxValue + ", Time: " + (endTime - startTime));

    }

    class MaxValueThreadSplit extends Thread {
        private int[] a;

        public MaxValueThreadSplit(int[] a) {
            this.a = a;
        }

        public void run() {
            int maxValue = Integer.MIN_VALUE;
            for (int i = 0; i < a.length; i++) {
                if (a[i] > maxValue)
                    maxValue = a[i];
            }
            if (MaxValue.maxValue < maxValue)
                MaxValue.maxValue = maxValue;
        }
    }

    class MaxValueThread extends Thread {
        private int startIndex;
        private final int endIndex;

        public MaxValueThread(int startIndex, int endIndex) {
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }

        public void run() {
            int threadMaxValue = MaxValue.a[startIndex];
            for (int k = startIndex + 1; k < endIndex; k++) {
                if (threadMaxValue < MaxValue.a[k])
                    threadMaxValue = MaxValue.a[k];
            }
            if (MaxValue.maxValue < threadMaxValue)
                MaxValue.maxValue = threadMaxValue;
        }
    }
}

/*
    static class ThreadOne extends Thread {
        public void run() {
            final int[] array = new Random().ints(4).toArray();
            System.out.println("Arrays: " + Arrays.toString(array));
            System.out.println("Maximum number: " + Arrays.stream(array).max());

        }

    }
*/

