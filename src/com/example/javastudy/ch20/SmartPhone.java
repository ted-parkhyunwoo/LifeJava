package com.example.javastudy.ch20;

import java.util.Objects;

public class SmartPhone {
    String number;

    public SmartPhone(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "번호: " + number;
    }
    // TODO: equals 메서드와 hashCode 메서드를 재정의해보세요.
    // END:

}
