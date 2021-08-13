package com.pluralsight.calcengine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InterRecureTest {

    @Test
    public void recurse(){
        InterRecure interRecure=new InterRecure();
        int k=3;
        String n="148";

     Assertions.assertEquals(3,new InterRecure().SuperDigit(n,k));



}}