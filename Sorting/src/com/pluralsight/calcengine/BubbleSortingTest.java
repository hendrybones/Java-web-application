package com.pluralsight.calcengine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortingTest {
    @Test
    public void bubble(){
        int[]a=new int[]{3,4,2,2,1,1,6};
        Assertions.assertEquals("[1, 1, 2, 2, 3, 4, 6]", Arrays.toString(new BubbleSorting().bubbles(a)));


    }

}