package com.pluralsight.calcengine.RunableAndThreads;

public class SeparateObject {
    public static void main(String args[]){
        int myLocalVar=0;
        String myLocalString="text";
        Runnable runnable1=new myRunnable();
//        Runnable runnable2=new myRunnable();
        Thread thread1=new Thread(runnable1,"Thread-1");
        Thread thread2=new Thread(runnable1,"Thread-1");

        thread1.start();
        thread2.start();

    }
}
