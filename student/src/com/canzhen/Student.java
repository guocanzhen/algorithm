package com.canzhen;

public class Student {
    private String address;
    private String zipCode;

    public Student() {
    }

    public Student(String address, String zipCode) {
        this.address = address;
        this.zipCode = zipCode;
    }

    public void getPostAddress(){
        System.out.println("地址为："+address+"，邮编为："+zipCode);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
