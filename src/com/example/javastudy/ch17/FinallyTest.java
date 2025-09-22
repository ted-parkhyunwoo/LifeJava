package com.example.javastudy.ch17;

import java.util.Random;

public class FinallyTest {

    public static void main(String[] args) {
        int random = new Random().nextInt(2);
        try {
            System.out.println("자원 획득:" + random);
            // System 자원 사용
            // 예외가 발생할 만한 코드
            int num = 1 / random;
            System.out.println("사용완료");
        } catch (Exception e) {
            // 예외 발생 시 처리코드
            System.out.println("예외처리:" + e.getMessage());
        } finally {
            // System자원 반납
            System.out.println("자원 반납");
        }
    }
}
