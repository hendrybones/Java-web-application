package com.pluralsight.calcengine.Timeout;

class ThreadDemo extends Thread{
    public void run(){
        System.out.println("Thread"+Thread.currentThread().getName() +"is running");
    }

}

public class TimeOuts {

    public static void main(String[] args){
        int n=8;
        for (int i=0;i<n;i++){
            ThreadDemo threadDemo=new ThreadDemo();
            threadDemo.start();
        }

    }

}
