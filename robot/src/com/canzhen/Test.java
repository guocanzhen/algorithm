package com.canzhen;

public class Test {
    public static void main(String[] args) {
        Human h1 = new Robot();
        h1.eat();
        h1.work();
        System.out.println("=================");
        Human h2 = new Wooder();
        h2.eat();
        h2.work();
    }
}
