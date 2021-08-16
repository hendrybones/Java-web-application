package com.pluralsight.calcengine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListSortTest {
    @Test

    public void ListArray(){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(50);
        list.add(30);
        list.add(40);
//        ?\Assertions.assertEquals("[10, 20, 30, 40, 50]", Arrays.toString(new ArrayListSort().Array()));

    }

}