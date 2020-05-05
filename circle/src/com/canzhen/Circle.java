package com.canzhen;

public class Circle {
    final static double PI = 3.14;
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double findPerimeter(){
        return 2*PI*radius;
    }

    public double findArea(){
        return PI*radius*radius;
    }
}
