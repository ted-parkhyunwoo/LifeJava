package com.example.javastudy.ch11;

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.setScore(-100);

        s.name = null;
        System.out.println(s.toString());
    }
}
