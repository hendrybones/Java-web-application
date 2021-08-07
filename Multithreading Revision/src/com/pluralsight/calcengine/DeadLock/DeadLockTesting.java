package com.pluralsight.calcengine.DeadLock;

public class DeadLockTesting {
    public static void main(String[] args){
        Object object1=new Object();
        Object object2=new Object();
        DeadLockDemo1 deadLockDemo1=new DeadLockDemo1(object1,object2);
        deadLockDemo1.start();
        DeadLockDemo2 deadLockDemo2=new DeadLockDemo2(object1,object2);
        deadLockDemo2.start();


    }
}
