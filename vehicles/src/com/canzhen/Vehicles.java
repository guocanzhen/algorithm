package com.canzhen;

public class Vehicles {
    private String color;

    public Vehicles() {
        run();
    }

    public Vehicles(String color) {
        this();
        this.color = color;
        System.out.println("小汽车是" + this.color + "颜色");
    }

    private void run(){
        System.out.println("小汽车已经开动了");
    }
}
