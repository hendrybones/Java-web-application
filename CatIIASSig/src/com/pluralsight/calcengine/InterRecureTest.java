package com.pluralsight.calcengine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InterRecureTest {

    @Test
    public void recurse(){
     Assertions.assertEquals(3,new InterRecure().SuperDigit("148",4));



}}