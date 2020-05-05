package com.canzhen;

public class Robot extends Human{
    @Override
    public void eat(){
        System.out.println("机器人充电。。。");
    }
    @Override
    public void work(){
        System.out.println("机器人工作。。。");
    }
}
