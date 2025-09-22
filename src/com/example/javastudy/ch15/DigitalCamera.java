package com.example.javastudy.ch15;

class Camera {}

// 2. DigitalCamera가 Chargeable을 구현하도록 하세요.
public class DigitalCamera extends Camera {
    public void charge() {
        System.out.println("디지털 카메라 충전");
    }
}
