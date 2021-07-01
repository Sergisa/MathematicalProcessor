package com.company.tests;

import com.company.Mathematics;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class MathematicsTest {
    private final static double DELTA = 0.001;

    @Test
    void factorial() {
        Assertions.assertEquals(6, Mathematics.factorial(3), DELTA);
    }

    @Test
    void exp() {
        Assertions.assertEquals(1, Mathematics.exp(0), DELTA);
    }

    @Test
    void sin() {
        Assertions.assertEquals(1, Mathematics.sin(Math.toRadians(90)), DELTA);
    }

    @Test
    void power() {
        Assertions.assertEquals(9, Mathematics.power(3,2), DELTA);
    }

    @Test
    void cos() {
        Assertions.assertEquals(0, Mathematics.cos(Math.toRadians(90)), DELTA);
    }
}