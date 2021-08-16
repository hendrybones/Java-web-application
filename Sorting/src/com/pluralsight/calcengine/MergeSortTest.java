package com.pluralsight.calcengine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {
    @Test
    public void merge(){
        int[]a=new int[]{20,30,10,9,39,};
        int[]b=new int[]{9,10,20,30,39};

        Assertions.assertEquals("[9, 10, 20, 30, 39]", Arrays.toString(new MergeSort().mergerArray(a)));
    }

}