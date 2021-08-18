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
    @Test
    public  void triangle(){
        assertEquals(0,new Main().triangle(0));
        assertEquals(1,new Main().triangle(1));
        assertEquals(2,new Main().triangle(3));
    }
    @Test
    public void parent(){
        assertEquals("(abc)",new Main().parent("xyz(abc)123","(abc)"));
        assertEquals("(hello)",new Main().parent("x(hello)","(hello)"));
        assertEquals("(xy)",new Main().parent("(xy)1","(xy)"));
    }
    @Test
    public void strCount(){
        assertEquals("hel*lo",new Main().StrCount("hello"));
    }

}