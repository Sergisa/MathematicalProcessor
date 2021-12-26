package com.company;

public class Mathematics {
    private static final int ITERATIONS = 17;

    public static double exp(double x) {
        return sigma(i -> power(x, i) / factorial(i), ITERATIONS);
    }

    public static double sin(double x) {
        return sigma(n -> (power(-1, n) * power(x, 2 * n + 1)) / (factorial(2 * n + 1)), ITERATIONS);
    }

    public static double cos(double x) {
        return sigma(n -> (power(-1, n) * power(x, 2 * n)) / (factorial(2 * n)), ITERATIONS);
    }

    public static int factorial(int x) {
        return x == 0 ? 1 : x * factorial(x - 1);
    }

    public static double power(double x, int power) {
        return power == 0 ? 1 : x * power(x, power - 1);
    }

    public static double mean(double[] x) {
        return sigma(n -> x[n], x.length) / x.length;
    }

    private static double sigma(IterableExpression expr) {
        return sigma(expr, 0);
    }

    private static double sigma(IterableExpression expr, int iterations) {
        return sigma(expr, iterations, 0);
    }

    private static double sigma(IterableExpression expr, int iterations, int iterationStart) {
        double sum = 0;
        for (int n = iterationStart; n < iterations; n++) {
            sum += expr.execute(n);
        }
        return sum;
    }

    private static double product(IterableExpression expr) {
        return product(expr, ITERATIONS);
    }

    private static double product(IterableExpression expr, int iterations) {
        return product(expr, iterations, 0);
    }

    private static double product(IterableExpression expr, int iterations, int iterationStart) {
        double res = 1;
        for (int n = iterationStart; n < iterations; n++) {
            res *= expr.execute(n);
        }
        return res;
    }
}