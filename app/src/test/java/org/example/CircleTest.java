package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    public void testGetArea() {
        Circle circle = new Circle(5);
        assertEquals(78.53981633974483, circle.getArea(), 0.0001);
    }

    @Test
    public void testGetPerimeter() {
        Circle circle = new Circle(5);
        assertEquals(31.41592653589793, circle.getPerimeter(), 0.0001);
    }
}