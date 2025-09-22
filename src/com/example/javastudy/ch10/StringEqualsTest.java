package com.example.javastudy.ch10;

public class StringEqualsTest {

    public static void main(String[] args) {
        String hello1 = new String("Hello");
        String hello2 = new String("Hello");

        System.out.println(hello1 == hello2);

        System.out.println(hello1.equals(hello2));
    }
}
