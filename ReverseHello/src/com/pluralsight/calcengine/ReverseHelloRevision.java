package com.pluralsight.calcengine;

public class ReverseHelloRevision extends Thread {
    static int count=0;

    public void run(){
        count ++;
        String message="hello thread  "+count+"!";

        if (count<50)
        {
            ReverseHelloRevision thread=new ReverseHelloRevision();
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(message);


        }

    }
    public static void main(String[] args){
        ReverseHelloRevision thread=new ReverseHelloRevision();
        thread.start();


    }



}
