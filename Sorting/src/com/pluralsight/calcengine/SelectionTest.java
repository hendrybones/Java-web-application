package com.pluralsight.calcengine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SelectionTest {
    @Test
    public  void select(){
        int[] a=new int[]{23,12,45,87};
        int[]b=new int[]{12,23,45,87};
        Assertions.assertEquals("[12, 23, 45, 87]", Arrays.toString(new Selection().SelectionSort(a)));
    }

}