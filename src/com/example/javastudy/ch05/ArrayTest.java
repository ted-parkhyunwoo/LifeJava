package com.example.javastudy.ch05;

public class ArrayTest {

    public static void main(String[] args) {
        int[] points = new int[3];

        System.out.println("points의 길이는: " + points.length);

        points[0] = 1;
        points[1] = 'A'; // 묵시적 형 변환
        // points[2] = 1.5; // double 은 할당 불가

        for (int i = 0; i < points.length; i++) {
            System.out.println(i + " : " + points[i]);
        }
    }

}
