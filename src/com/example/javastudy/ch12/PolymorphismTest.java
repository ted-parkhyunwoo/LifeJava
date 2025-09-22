package com.example.javastudy.ch12;

public class PolymorphismTest {

    public static void main(String[] args) {
        Object[] objs = new Object[4];
        objs[0] = 1;
        objs[1] = "Hello";
        objs[2] = new Object();

        int i = objs[0] instanceof Integer ? (Integer) objs[0] : 0;
        System.out.println("변경된 i: " + i);

        int sum = 0;
        // TODO: objs의 요소를 모두 더하세요. 단 문자열은 길이를 더하세요
        // END:
        System.out.println(sum);
    }

}
