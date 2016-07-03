package com.twu.oo;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RectangleTest {
    @Test
    public void areaShouldReturn6WhenTheLengthIs2AndBreathIs3() {
        Rectangle rectangle = new Rectangle(2, 3);
        assertEquals(6, rectangle.area(), 0);
    }

    @Test
    public void areaShouldReturn12WhenTheLengthIs2AndBreathIs6() {
        Rectangle rectangle = new Rectangle(2, 6);
        assertEquals(12, rectangle.area(), 0);
    }

    @Test
    public void perimeterShouldReturn12WhenTheLengthIs2AndBreathIs4() {
        Rectangle rectangle = new Rectangle(2, 4);
        assertEquals(12, rectangle.perimeter(), 0);
    }

    @Test
    public void perimeterShouldReturn14WhenTheLengthIs3AndBreathIs4() {
        Rectangle rectangle = new Rectangle(3, 4);
        assertEquals(14, rectangle.perimeter(), 0);
    }

    @Test
    public void areaForSquareShouldReturn4WhenSideIs2() {
        Rectangle square = Rectangle.createSquare(2);
        assertEquals(4, square.area(), 0);
    }

    @Test
    public void perimeterForSquareShouldReturn4WhenSideIs2() {
        Rectangle square = Rectangle.createSquare(2);
        assertEquals(8, square.perimeter(), 0);
    }
}
