package com.example.javastudy.ch13;

public class Person extends Object {
    String name;

    public Person(String name) {
        super(); // Object 생성자 호출
        this.name = name;
    }

    public Person() {
        this("피터파커");
    }

    void move() {
        System.out.println("걷기");
    }

    @Override
    public String toString() {
        return "[person] name:" + this.name;
    }
}
