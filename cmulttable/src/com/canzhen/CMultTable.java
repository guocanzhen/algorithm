package com.canzhen;

//九九乘法表
public class CMultTable {
    public static void main(String[] args) {
//        for (int i =1; i<=9; i++){
//            for (int j = 1; j <= i;j++){
//                System.out.print(j + "*"+ i + "=" + (i*j) + "  ");
//            }
//            System.out.println();
//        }
        factorial(9);
        System.out.println();
        m(5);
    }

//    递归实现
    public static void factorial(int n) {
        if (n ==1){
            System.out.println("1*1=1  ");
        }else {
            factorial(n-1);
            for (int i = 1; i<=n;i++){
                System.out.printf(i + "*"+ n + "=" + (i*n) + "  ");
            }
            System.out.println();
        }
    }

    public static void m(int i){
        if (i ==1){
            System.out.println(i);
        }else {
            m(i-1);
            System.out.println(i);
        }
    }
}
