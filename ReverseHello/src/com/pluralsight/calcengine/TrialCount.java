package com.pluralsight.calcengine;


public class TrialCount {
    static Thread[] threads = new Thread[10];
    public static void main(String[] args)
    {
        //threads
        Count c = new Count();
        for(int i=0;i<10;i++)
        {
            threads[i] = new Thread(c);
            threads[i].start();

        }

    }
}

class Count implements Runnable {
    private int count=0;
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            synchronized (this){
                this.count++;
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(Thread.currentThread().getName()+":" +this.count);
    }


}



