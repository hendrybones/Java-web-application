package com.pluralsight.calcengine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void select(){
        int[]a =new int[]{3,4,5,6,8,7};
        Assertions.assertEquals("[3, 4, 5, 6, 7, 8]", Arrays.toString(new Main().SelectionSort(a)));

    }
    public  void bubble(){
        int[]a =new int[]{3,4,5,6,8,7};
        Assertions.assertEquals("[3, 4, 5, 6, 7, 8]", Arrays.toString(new Main().BubbleSort(a)));

    }
    public void quick(){
        int[]a =new int[]{3,4,5,6,8,7};
        Assertions.assertEquals("[3, 4, 5, 6, 7, 8]", Arrays.toString(new Main().quickSort(a,0,a.length-1)));

    }

}