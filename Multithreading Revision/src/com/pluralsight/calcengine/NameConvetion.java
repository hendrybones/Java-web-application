package com.pluralsight.calcengine;

public class NameConvetion  extends Thread{
    public void runO(){
        System.out.println("running...");
    }
    public static void main(String args[]){
        NameConvetion t1=new NameConvetion();
        NameConvetion t2=new NameConvetion();
        System.out.println("Name of t1:"+t1.getName());
        System.out.println("Name of t2:"+t2.getName());
        System.out.println("id of t1:"+t1.getId());
        System.out.println("id of t1:"+t2.getId());
        t1.start();
        t2.start();

        t1.setName("hendry mwamburi");
        System.out.println("After changing name of t1:"+t1.getName());
    }
}
