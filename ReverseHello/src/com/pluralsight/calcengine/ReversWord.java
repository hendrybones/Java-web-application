package com.pluralsight.calcengine;

import static com.pluralsight.calcengine.ThreadReverseHello.ThreadClass.rev;

public class ReversWord implements Runnable {
    private Thread t;
    private String threadName;

    public ReversWord(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.print("running" + threadName);
        try {
            String s = "Hello!";
            s = rev(s);
            for (int i = 0; i < 50; i++) {
                System.out.println("Thread" + threadName + "," + i + s);
                //let the thread sleep for a while
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("thread" + threadName + "interrupted");
        }
        System.out.println("Thread" + threadName + "Exiting");


    }
    public void start(){
        System.out.println("Starting "+threadName);
        if (t==null)
        {
            t=new Thread(this,threadName);
            t.start();

        }
    }

    public static String rev(String s)
    {
        return new StringBuilder(s).reverse().toString();
    }
    public static void main(String[] args){
        ReversWord r1=new ReversWord("Thread");
        r1.start();

    }
}