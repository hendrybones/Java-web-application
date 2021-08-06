package com.pluralsight.calcengine.ConcurreyAndConcurrency;

public class Priority extends Thread{
    public void run(){
        System.out.println("running thread name"+ Thread.currentThread().getName());
        System.out.println("running thread priority is"+ Thread.currentThread().getPriority());
    }
    public static void main(String args[]){
        Priority t1=new Priority();
        Priority t2=new Priority();

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }

}
