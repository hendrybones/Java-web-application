package com.pluralsight.calcengine.RunableAndThreads;

public class myRunnable implements Runnable{
    private int count=0;
    @Override
    public void run() {
        for (int i=0;i<1000;i++){
            synchronized (this){
                this.count++;
            }
        }
        System.out.println(Thread.currentThread().getName()+":" +this.count);
    }
}
