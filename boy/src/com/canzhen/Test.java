package com.canzhen;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        Boy mike = new Mike();
        student.setBoy(mike);
        student.whoIsEatting();
        System.out.println("==============");
        Boy amy = new Amy();
        student.setBoy(amy);
        student.whoIsEatting();
    }
}
