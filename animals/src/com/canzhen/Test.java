package com.canzhen;

public class Test {
    public static void main(String[] args) {
        System.out.println("老虎类打印。。。");
        Animals tiger = new Tiger();
        tiger.run();
        System.out.println("袋鼠类打印。。。");
        Animals kangaroo = new Kangaroo();
        kangaroo.run();
        Panda.run();
        System.out.println(Panda.color);
    }
}
