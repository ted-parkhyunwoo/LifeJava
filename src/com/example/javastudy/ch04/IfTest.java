package com.example.javastudy.ch04;

public class IfTest {

    public static void main(String[] args) {
        char color = 'G';
        String status = "";
        if (color == 'G') {
            status = "진행";
        }

        if (color != 'G')
            status = "멈춤";

        System.out.println(color + "에서는 " + status); // G에서는 진행
    }

}
