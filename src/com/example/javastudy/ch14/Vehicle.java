package com.example.javastudy.ch14;

class DieselCar extends Vehicle {
    public void addFuel() {
        System.out.println("급유");
    }
}

class ElecCar extends Vehicle {
    public void addFuel() {
        System.out.println("충전");
    }
}

public abstract class Vehicle {
    public void driveTo(String to) {
        System.out.println(to + " 까지 이동");
    }

    public abstract void addFuel();
}

// TODO: Vehicle을 상속받는 HorseCart 클래스를 작성해보세요.
// END:
