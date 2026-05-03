import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CircleTest {
    @Test
    public void testThatCircleAreaMethodReturnsAccurateArea() {
        double radius = 1;
        double expected = Circle.circleArea(radius);
        double actual = 3.14159;
        assertTrue(Math.abs(actual - expected) <= 0.001);

        radius = 5;
        expected = Circle.circleArea(radius);
        actual = 78.5398;
        assertTrue(Math.abs(actual - expected) <= 0.001);

        radius = 0;
        expected = Circle.circleArea(radius);
        actual = 0;
        assertTrue(Math.abs(actual - expected) <= 0.001);
    }
}