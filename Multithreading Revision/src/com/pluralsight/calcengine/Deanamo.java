package com.pluralsight.calcengine;

public class Deanamo extends Thread{
    public  void run(){
        if (Thread.currentThread().isDaemon()){
            System.out.println("daemon thread works");
        }
        else {
            System.out.println("user thread works");
        }
    }
    public static void main(String[] args){
        Deanamo t1=new Deanamo();
        Deanamo t2=new Deanamo();
        Deanamo t3=new Deanamo();

        t1.setDaemon(true);

        t1.start();
        t2.start();
        t3.start();
    }
}
