package com.example.javastudy.ch04;

public class BreakContinueTest {

    public static void main(String[] args) {
        int dan = 5;

        for (int i = 1; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(dan + " * " + i + " = " + (dan * i));
        }
        System.out.println("===========================");
        for (int i = 1; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(dan + " * " + i + " = " + (dan * i));
        }

        for (int i = 1; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.print(i);
        }
    }


}
