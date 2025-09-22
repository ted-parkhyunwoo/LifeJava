package com.example.javastudy.ch04;

public class IfElseIfTest {

    public static void main(String[] args) {
        char color = 'R';
        String status = "";
        if (color == 'G') {
            status = "진행";
        } else if (color == 'R') {
            status = "멈춤";
        } else {
            status = "상황에 따라 행동";
        }
        System.out.println(color + "에서는 " + status); // G에서는 진행
    }

}
