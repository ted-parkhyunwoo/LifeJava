package com.example.javastudy.ch05;

public class ArrayInitTest {
    public static void main(String[] args) {

        // 생성과 값 할당이 분리된 경우
        boolean[] bools1 = new boolean[2];
        bools1[0] = true;
        bools1[1] = false;

        boolean[] bools2 = null;
        bools2 = new boolean[2];
        bools2[0] = true;
        bools2[1] = false;

        // 생성과 동시에 초기화를 진행하는 경우
        char[] chars1 = new char[] {'A', 'B', 'C'};

        char[] chars2 = {'A', 'B', 'C'};

        // 선언과 생성이 별도로 분리되어야 하는 경우
        if (args.length == 0) {
            args = new String[] {"Hello", "Java", "World"};
        }
    }
}
