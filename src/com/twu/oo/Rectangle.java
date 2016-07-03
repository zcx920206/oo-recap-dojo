package com.twu.oo;

class Rectangle implements Shape {
    private final int breath;
    private final int length;

    Rectangle(int length, int breath) {
        this.length = length;
        this.breath = breath;
    }

    public float area() {
        return length * breath;
    }

    public float perimeter() {
        return 2 * (length + breath);
    }

    static Rectangle createSquare(int side) {
        return new Rectangle(side, side);
    }
}
