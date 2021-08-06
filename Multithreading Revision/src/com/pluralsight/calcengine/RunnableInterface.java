package com.pluralsight.calcengine;

public class RunnableInterface  implements Runnable{
    private final long count;

    public RunnableInterface(long count) {
        this.count = count;
    }


    @Override
    public void run() {
        long sum=0;
        for (long i=1;i<count;i++)
        {
            sum +=i;
        }
        System.out.println(sum);


    }
}
