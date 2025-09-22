package com.example.javastudy.ch13;

public class MemberBindingTest {

    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        System.out.println(subClass.x);
        subClass.method();

        SuperClass superClass = subClass;
        System.out.println(superClass.x);
        superClass.method();
    }
}
