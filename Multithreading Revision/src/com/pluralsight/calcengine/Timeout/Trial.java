package com.pluralsight.calcengine.Timeout;

public class Trial implements Runnable {
    private Thread t;
    private String threadName;

    public Trial(String threadName) {
        this.threadName = threadName;
        System.out.println("Creating" +threadName);
    }


    @Override
    public void run() {
        System.out.println("Running"+threadName);
        try {
            for (int i=4;i>0;i--){
                System.out.println("Thread"+ threadName);
                //let thread sleep
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("thread" +threadName+"interrupted");
        }
        System.out.println("thread"+threadName+"exiting");

    }
    public void start(){
        System.out.println("starting" +threadName);
        if (t==null){
            t=new Thread(this,threadName);
            t.start();
        }
    }
    public static void main(String[] args){
        Trial trial=new Trial("Thread-1");
        trial.start();
        Trial trial1=new Trial("Thread-1");
        trial1.start();
    }
}
