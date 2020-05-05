package com.canzhen;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.5);
        Circle c2 = new Circle(10);
        System.out.println(c1.findPerimeter());
        System.out.println(c1.findArea());
        System.out.println(c2.findPerimeter());
        System.out.println(c2.findArea());
    }
}
