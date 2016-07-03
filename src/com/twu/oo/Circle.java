package com.twu.oo;

class Circle implements Shape{
    static final float PI = (float) 3.14;
    private final float radius;

    Circle(float radius) {
        this.radius=radius;
    }

    @Override
    public float area() {
        return PI *radius*radius;
    }

    @Override
    public float perimeter() {
        return PI*radius*2;
    }
}
