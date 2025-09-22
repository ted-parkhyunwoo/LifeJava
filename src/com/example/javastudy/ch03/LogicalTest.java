package com.example.javastudy.ch03;

public class LogicalTest {

    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;

        System.out.println(b1 & b2); // false
        System.out.println(b1 | b2); // true
        System.out.println(!b1); // false
        System.out.println(b1 ^ b2); // true
    }

}
