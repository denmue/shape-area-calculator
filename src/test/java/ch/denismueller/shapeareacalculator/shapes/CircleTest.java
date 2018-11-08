package ch.denismueller.shapeareacalculator.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CircleTest {
    private final Shape circle = new Circle();

    @Test
    void areaWithAttributes() {
        double circleRadius = 5;
        circle.setAttribute("radius", circleRadius);
        assertEquals(25 * Math.PI, circle.area());
    }

    @Test
    void areaWithoutAttributes() {
        assertThrows(NullPointerException.class, circle::area);
    }

}