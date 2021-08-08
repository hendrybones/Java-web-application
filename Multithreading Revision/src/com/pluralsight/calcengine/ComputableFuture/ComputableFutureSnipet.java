package com.pluralsight.calcengine.ComputableFuture;

import java.security.Provider;
import java.util.Random;
import java.util.concurrent.*;

public class ComputableFutureSnipet {
    public static void main(String[] args){
        ExecutorService executorService= Executors.newFixedThreadPool(10);
        //submit task and accept placeholder object for return value
        Future<Integer> future= (Future<Integer>) executorService.submit(new Task());
        try {
            Integer results=future.get();
            System.out.println("results from task" +results);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    private static class Task implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            return new Random().nextInt();
        }
    }
}
