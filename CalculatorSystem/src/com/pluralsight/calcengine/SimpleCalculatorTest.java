package com.pluralsight.calcengine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SimpleCalculatorTest {

    @Test
    double add(double v, double v1) {
        final double expected=6;
        final double actual=add(2.0,3.0);
        Assertions.assertEquals(expected,actual);

        return expected;
    }

    @Test
    void multi() {
    }
}