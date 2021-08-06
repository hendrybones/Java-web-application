package com.pluralsight.calcengine;

public class ThreadPool implements Runnable{
    private String message;

    public ThreadPool(String massage) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" (Start) message = "+message);
        processmessage();
        

    }

    private void processmessage() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
