package com.example.javastudy.ch13;

public class SubClass extends SuperClass {
    public String x = "sub";

    @Override
    public void method() {
        System.out.println("sub method");
    }
}
