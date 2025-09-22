package com.example.javastudy.ch04;

public class IfElseTest {

    public static void main(String[] args) {
        char color = 'G';
        String status = "";
        if (color == 'G') {
            status = "진행";
        } else {
            status = "멈춤";
        }

        // 조건 연산자 활용
        status = color == 'G' ? "정지" : "멈춤";
        System.out.println(color + "에서는 " + status); // G에서는 진행

    }

}
