package com.example.javastudy.ch18;

import java.io.IOException;

class Parent {
    void method() throws IOException {}
}


class Child extends Parent {
    @Override
    void method() throws IOException {} // 정상

    // void method() throws FileNotFoundException {}// 정상

    // void method() {}// 정상

    // void method() throws Exception {}// 오류

    // void method() throws ClassNotFoundException {}// 오류
}


public class MethodOverrideTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
