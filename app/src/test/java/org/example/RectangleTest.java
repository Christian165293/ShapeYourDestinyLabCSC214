package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    public void testGetArea() {
        Rectangle rectangle = new Rectangle(4, 6);
        assertEquals(24, rectangle.getArea(), 0.0001);
    }

    @Test
    public void testGetPerimeter() {
        Rectangle rectangle = new Rectangle(4, 6);
        assertEquals(20, rectangle.getPerimeter(), 0.0001);
    }
}