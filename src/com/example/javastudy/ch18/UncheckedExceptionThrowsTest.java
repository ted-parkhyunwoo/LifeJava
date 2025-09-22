package com.example.javastudy.ch18;

public class UncheckedExceptionThrowsTest {
    public static void main(String[] args) {
        UncheckedExceptionThrowsTest et = new UncheckedExceptionThrowsTest();
        // TODO: method1 호출의 결과로 전달된 예외를 처리해보세요.
            et.method1();
        // END:
        System.out.println("프로그램 종료");
    }

    public void method1() {
        method2();
    }

    public void method2() {
        int i = 1 / 0;
    }
}
