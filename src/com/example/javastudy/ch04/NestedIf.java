package com.example.javastudy.ch04;

public class NestedIf {

    public static void main(String[] args) {
        char color = 'Y';
        int toStopLine = 1;
        String status = "";
        if (color == 'G') {
            status = "진행";
        } else if (color == 'R') {
            status = "멈춤";
        } else {
            if (toStopLine > 3) {
                status = "정지선에 정지";
            } else {
                status = "빠르게 통과";
            }
        }
        System.out.println(color + "에서는 " + status); // G에서는 진행
    }

}
