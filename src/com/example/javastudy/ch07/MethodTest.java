package com.example.javastudy.ch07;

public class MethodTest {
    public int add(int a, int b) {
        return a + b;
    }

    public void sayHello(String name) {
        System.out.println("hello " + name);
    }

    public static void main(String[] args) {
        MethodTest mt = new MethodTest();
        // 반환 값이 있는 경우
        int result = mt.add(10, 20);
        System.out.println("합 결과: " + result);
        // 반환 값이 없는 경우 - void
        mt.sayHello("hong");
    }
}
