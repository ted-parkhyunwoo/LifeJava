package com.example.javastudy.ch05;

import java.util.Arrays;

public class ArrayTraversalTest {

    public static void main(String[] args) {
        String[] strs = {"Hello", "Java", "Array"};

        for (int i = 0; i < 3; i++) {
            System.out.println(i + " : " + strs[i]);
        }

        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            System.out.println(i + " : " + str);
        }

        for (String str : strs) {
            System.out.println(str);
        }

        // 배열의 내용 출력
        System.out.println(Arrays.toString(strs)); // [Hello, Java, Array]



    }

}
