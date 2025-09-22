package com.example.javastudy.ch05;

public class ArrayBoundTest {

    public static void main(String[] args) {
        char[] chars = {'A', 'B', 'C'};
        System.out.println(chars[3]); // 예외 발생: Index 3 out of bounds for length 3
    }

}
