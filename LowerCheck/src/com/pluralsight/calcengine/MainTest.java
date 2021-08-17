package com.pluralsight.calcengine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void lower(){
        assertEquals(4,new Main().lowerString("xxhixx"));
        assertEquals(3,new Main().lowerString("xhixhix"));
        assertEquals(0,new Main().lowerString("hi"));


    }
    @Test
    public void StringCount(){
      assertEquals(2,new Main().StringCheck("catcowcat","cat"));

    }

}