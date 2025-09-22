package com.example.javastudy.ch08;

public class InitializerTest {
    int iv;
    static int cv;
    
    // static 초기화 블록
    static {
        System.out.println("static initializer");
        cv = 100;
    }
    
    // instance 초기화 블록
    {
        System.out.println("instance initializer");
        iv = 100;
    }

    public InitializerTest() {
        System.out.println("생성자-iv: " + iv + ", cv: " + cv);
        this.iv = 300;
    }

    public static void main(String args[]) {
        // TODO: 1. 별도의 코드 없이 실행해보고 static 초기화 블록의 동작을 확인하세요.
        // END:
        
        // TODO: 2. InitializerTest 타입의 객체를 생성해보고 객체의 iv 값을 확인해보세요.
        // END:
    }
}
