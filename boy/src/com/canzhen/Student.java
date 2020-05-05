package com.canzhen;

public class Student {
    private Boy boy;

    public Boy getBoy() {
        return boy;
    }

    public void setBoy(Boy boy) {
        this.boy = boy;
    }

    public void whoIsEatting(){
        boy.eat();
    }
}
