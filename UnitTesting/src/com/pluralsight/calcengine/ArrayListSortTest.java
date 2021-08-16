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
        ArrayList<Integer> output=new ArrayList<>();
        output.add(10);
        output.add(20);
        output.add(30);
        output.add(40);
        output.add(50);
        Assertions.assertEquals(output,new ArrayListSort().Array(list));

    }

}