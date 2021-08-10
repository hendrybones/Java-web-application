package com.pluralsight.calcengine;

import java.util.ArrayList;
import java.util.List;

public class ThreadReverseHello {

    public void execute() {
        ThreadClass[] t1 = new ThreadClass[50];
        for (int i = 0; i < t1.length; i++) {

        }
    }

    static class ThreadClass extends Thread {
        String s = "Hello from Thread <num>!";

        public void run() {
            s = rev(s);
            System.out.println(s + Thread.currentThread().getName());


        }

        public static String rev(String s) {
            return new StringBuilder(s).reverse().toString();

        }

    }
}


