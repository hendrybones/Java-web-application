package com.pluralsight.calcengine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void merge(){
        int[]a =new int[]{3,4,5,6,8,7};
        Assertions.assertEquals("[3, 4, 5, 6, 7, 8]", Arrays.toString(new Solution.mergeHalve(a,0,a.length-1)));



    }

}