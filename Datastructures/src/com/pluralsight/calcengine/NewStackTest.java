package com.pluralsight.calcengine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NewStackTest {


    @Test
    public void push(){
        NewStack stack=new NewStack();
        stack.push(15);
        stack.push(10);
        stack.push(3);
        Assertions.assertEquals(3,stack.pop());


    }


}