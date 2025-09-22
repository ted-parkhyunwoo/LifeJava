package com.example.javastudy.ch07;

public class Phone {
    String number; // 멤버 변수, 필드

    public Phone() {}


    public void call(String to) { // 파라미터
        // 로컬 변수, 지역 변수
        String msg = number + "에서 " + to + "에게 전화";
        System.out.println(msg);



    }
}
