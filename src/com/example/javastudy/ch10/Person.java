package com.example.javastudy.ch10;

public class Person  {
    String name;

    public Person(String name) {
        super(); 
        this.name = name;
    }

    public Person() {
        this("익명");
    }

    void move() {
        System.out.println("걷기");
    }
    // TODO: 5. toString()을 재정의 하세요.
    // END:
}
