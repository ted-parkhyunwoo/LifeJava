package com.example.javastudy.ch04;

public class SwitchTest {

    public static void main(String[] args) {
        int month = 4;

        int days = -1;
        switch (month) {
            case 2:
                days = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            default:
                days = 31;
        }
        System.out.println(month + "월은 " + days + "까지 있다.");
    }

}
