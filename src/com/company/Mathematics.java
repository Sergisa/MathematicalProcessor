package com.company;

public class Mathematics {
    private static final int ITERATIONS = 17;

    public static double exp(double x) {
        return sigma(i -> power(x, i) / factorial(i), ITERATIONS);
    }

    public static double sin(double x) {
        double sum = 0;
        for(int n = 0; n < 19; n++){
            sum += Math.pow(-1, n) * ((Math.pow(x, 2 * n + 1)) / (factorial(2 * n + 1)));
        }
        return sum;
        //return sigma(n -> (power(-1, n) * power(x, 2 * n + 1)) / (factorial(2 * n + 1)), 28);
    }

    public static double cos(double x) {
        return sigma(n -> (power(-1, n) * power(x, 2 * n)) / (factorial(2 * n)), ITERATIONS);
    }

    public static int factorial(int x) {
        if (x == 0) return 1;
        return x * factorial(x - 1);
    }

    public static double power(double x, int power) {
        return product(n -> x, power);
    }

    public static double mean(double[] x) {
        return sigma(n -> x[n], x.length) / x.length;
    }

    public static double sigma(IterableExpression expr) {
        return sigma(expr, 0);
    }

    public static double sigma(IterableExpression expr, int iterations) {
        return sigma(expr, iterations, 0);
    }

    public static double sigma(IterableExpression expr, int iterations, int iterationStart) {
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