import com.company.Mathematics;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class MathematicsTest {
    private final static double DELTA = 0.1;

    @Test
    void factorial() {
        Assertions.assertEquals(6, Mathematics.factorial(3));
    }

    @Test
    void exp() {
        Assertions.assertEquals(1, Mathematics.exp(0), DELTA);
    }

    @Test
    void sin() {
        Assertions.assertEquals(0, Mathematics.sin(Math.toRadians(0)), DELTA, "sin(0)");
        Assertions.assertEquals(0.5, Mathematics.sin(Math.toRadians(30)), DELTA, "sin(30)");
        Assertions.assertEquals(Math.sqrt(2) / 2, Mathematics.sin(Math.toRadians(45)), DELTA, "sin(45)");
        Assertions.assertEquals(Math.sqrt(3) / 2, Mathematics.sin(Math.toRadians(60)), DELTA, "sin(60)");
        Assertions.assertEquals(1, Mathematics.sin(Math.toRadians(90)), DELTA, "sin(90)");
        Assertions.assertEquals(Math.sqrt(3) / 2, Mathematics.sin(Math.toRadians(90 + 30)), DELTA, "sin(120)");
        Assertions.assertEquals(Math.sqrt(2) / 2, Mathematics.sin(Math.toRadians(90 + 45)), DELTA, "sin(135)");
        Assertions.assertEquals(0.5, Mathematics.sin(Math.toRadians(90 + 60)), DELTA, "sin(150)");
        Assertions.assertEquals(0, Mathematics.sin(Math.toRadians(180)), DELTA, "sin(180)");
    }

    @Test
    void power() {
        Assertions.assertEquals(9, Mathematics.power(3, 2));
    }

    @Test
    void cos() {
        Assertions.assertEquals(0, Mathematics.cos(Math.toRadians(90)), DELTA);
    }

    @Test
    void mean() {
        double[] values = new double[]{1, 2, 3, 4, 5, 6};
        Assertions.assertEquals(3.5, Mathematics.mean(values), "Array passed to function");
    }
}