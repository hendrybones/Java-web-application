package com.pluralsight.calcengine;

public class counter {
    private int val;

    public void Counter() {
        val = 0;
    }

    public void increment() {
        val = val + 1;
    }

    public void decrement() {
        val = val - 1;
    }

    public int getVal() {
        return val;
    }
}
