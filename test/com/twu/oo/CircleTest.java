package com.twu.oo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest {
    @Test
    public void areaShouldReturn314WhentheRadiusIs10() {
        Circle circle = new Circle(10);
        assertEquals(314, circle.area(), 0);
    }

    @Test
    public void perimeterShouldReturn628WhentheRadiusIs100() {
        Circle circle = new Circle(100);
        assertEquals(628, circle.perimeter(), 0);
    }

}
