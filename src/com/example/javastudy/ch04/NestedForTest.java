package com.example.javastudy.ch04;

public class NestedForTest {

    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            System.out.println(i + "단 출력");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + "*" + j + "=" + (i * j));
            }
        }
    }

}
