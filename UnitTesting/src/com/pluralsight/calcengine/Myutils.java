package com.pluralsight.calcengine;

import java.util.ArrayList;

public class Myutils {
    public static <T> void iterateList(ArrayList<T> anyList){
        for (T temp:anyList){
            System.out.println(temp);
        }

    }
}
