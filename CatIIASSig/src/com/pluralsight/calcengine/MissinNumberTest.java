package com.pluralsight.calcengine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MissinNumberTest {

    @Test
    public void missing(){
        MissinNumber num=new MissinNumber();
        int[]a=new int[]{203,203,205,206,207,208,203,204,205,206};
        int[]b=new int[]{203,204,205,206,207,205,208,203,206,205,206,204};
        int[]outPut=new int[]{204,205,206};

        Assertions.assertEquals("204 205 206",new MissinNumber().Numbers(a,b));



    }

}