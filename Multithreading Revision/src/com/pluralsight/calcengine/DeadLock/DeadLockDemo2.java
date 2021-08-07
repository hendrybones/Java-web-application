package com.pluralsight.calcengine.DeadLock;

public class DeadLockDemo2 extends Thread{
    private Object object1;
    private Object object2;

    public DeadLockDemo2(Object object1, Object object2) {
        this.object1 = object1;
        this.object2 = object2;
    }
    public void run(){
        synchronized (object1){
            System.out.println("acquire lock on object1"+Thread.currentThread().getName());
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (object2){
            System.out.println("acquire lock on object2"+Thread.currentThread().getName());

        }
/*
        synchronized (object1){
            try {
                System.out.println("acquire lock on object2 waiting for object1");
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (object2){
                System.out.println("acquire lock on object1 && object2");

            }
        }
*/

    }
}
