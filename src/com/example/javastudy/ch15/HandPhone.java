package com.example.javastudy.ch15;

class Phone {}

// 1. HandPhone이 Chargeable을 구현하도록 하세요.
public class HandPhone extends Phone {
    public void charge() {
        System.out.println("헨드폰 충전");
    }
}
