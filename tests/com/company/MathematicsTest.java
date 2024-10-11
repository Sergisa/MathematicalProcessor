package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class MathematicsTest {
    private final static double DELTA = 0.001;

    @Test
    void factorial() {
        Assertions.assertEquals(6, Mathematics.factorial(3));
        Assertions.assertEquals(2, Mathematics.factorial(2));
        Assertions.assertEquals(1, Mathematics.factorial(1));
        Assertions.assertEquals(1, Mathematics.factorial(0));
    }

    @Test
    void exp() {
        Assertions.assertEquals(1, Mathematics.exp(0), DELTA);
    }

    @Test
    void sin() {
        Assertions.assertEquals(1, Mathematics.sin(Math.toRadians(90)), DELTA);
        Assertions.assertEquals(0.707, Mathematics.sin(Math.toRadians(45)), DELTA);
        Assertions.assertEquals(0.173, Mathematics.sin(Math.toRadians(10)), DELTA);
        Assertions.assertEquals(0, Mathematics.sin(Math.toRadians(180)), DELTA);
    }

    @Test
    void power() {
        Assertions.assertEquals(9, Mathematics.power(3, 2));
        Assertions.assertEquals(0, Mathematics.power(0, 1));
        Assertions.assertEquals(1, Mathematics.power(1, 0));
        Assertions.assertEquals(1, Mathematics.power(1, 1));
        Assertions.assertEquals(2, Mathematics.power(2, 1));
        Assertions.assertEquals(4, Mathematics.power(2, 2));
        Assertions.assertEquals(-1, Mathematics.power(-1, 1));
        Assertions.assertEquals(1, Mathematics.power(-1, 2));
        Assertions.assertEquals(-1, Mathematics.power(-1, 3));
        Assertions.assertEquals(1, Mathematics.power(-1, 4));
    }

    @Test
    void cos() {
        Assertions.assertEquals(0, Mathematics.cos(Math.toRadians(90)), DELTA);
        Assertions.assertEquals(0.707, Mathematics.cos(Math.toRadians(45)), DELTA);
        Assertions.assertEquals(0.984, Mathematics.cos(Math.toRadians(10)), DELTA);
        Assertions.assertEquals(-1, Mathematics.cos(Math.toRadians(180)), DELTA);
    }

    @Test
    void mean() {
        double[] values = new double[]{1, 2, 3, 4, 5, 6};
        Assertions.assertEquals(3.5, Mathematics.mean(values));
        double[] X = new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        Assertions.assertEquals(5, Mathematics.mean(X));
    }

    @Test
    void sigma() {
        double[] X = new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        double disp = Mathematics.sigma(i -> Math.pow(X[i] - Mathematics.mean(X), 2), X.length,0)/ (X.length - 1);
        Assertions.assertEquals(7.5, disp, DELTA);
    }
}