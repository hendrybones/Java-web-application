package com.pluralsight.calcengine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void string(){
        Assertions.assertEquals("not candy",new Main().notString("candy"));
        Assertions.assertEquals("not x",new Main().notString("x"));
        Assertions.assertEquals("not bad",new Main().notString("not bad"));
    }
    @Test
    public void missingCha(){
        Assertions.assertEquals("ktten",new Main().missingChar("kitten", 1));
    }
    @Test
    public void front(){
        Assertions.assertEquals("eodc",new Main().frontEnd("code"));

    }
    @Test
    public  void font3(){
        Assertions.assertEquals("JavaJavaJava",new Main().font3("java"));
    }

}