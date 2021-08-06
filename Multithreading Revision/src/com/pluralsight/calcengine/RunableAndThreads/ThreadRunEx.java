package com.pluralsight.calcengine.RunableAndThreads;

public class ThreadRunEx implements Runnable {
    private Thread t;
    private String threadName;

    public ThreadRunEx( String threadName) {
        this.threadName = threadName;
        System.out.println("creating" + threadName);
    }

    @Override
    public void run() {
        System.out.print("running" +threadName);

        try {
            for (int i=4;i>0;i--)
            {
                System.out.println("Thread" +threadName+ "," +i);
                //let the thread sleep for a while
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("thread" +threadName+"interrupted");
        }
        System.out.println("Thread" + threadName+ "Exiting");

    }
    public void start(){
        System.out.println("Starting "+threadName);
        if (t==null)
        {
            t=new Thread(this,threadName);
            t.start();

        }
    }
    public static void main(String[] args){
        ThreadRunEx r1=new ThreadRunEx("Thread");
        r1.start();
        ThreadRunEx r2=new ThreadRunEx("Thread");
        r2.start();
    }

}
