package com.canzhen;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setAddress("北京");
        student1.setZipCode("010");
        student1.getPostAddress();

        Student student2 = new Student("武汉","027");
        student2.getPostAddress();
    }
}
