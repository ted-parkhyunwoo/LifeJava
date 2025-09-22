package com.example.javastudy.ch08; // package 선언

public class ClassStructure { // class 선언부

    String name; // 멤버 변수 선언
    int age;

    {
        name = "andy";
    } // 초기화 블록

    public ClassStructure(String name, int age) { // 생성자
        this.name = name;
        this.age = age;
    }

    public void setName(String name) { // 메서드
        this.name = name;
    }
}
