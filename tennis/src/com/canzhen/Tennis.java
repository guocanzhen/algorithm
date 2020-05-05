package com.canzhen;

public class Tennis implements A , B {
    private String name;

    public Tennis() {
    }

    public Tennis(String name) {
        this.name = name;
    }

    @Override
    public void serve() {
        System.out.println(name+"优美的发球。。。");
    }

    @Override
    public void point() {
        System.out.println(name+"压制对手于网前，得分。。。");
    }
}
