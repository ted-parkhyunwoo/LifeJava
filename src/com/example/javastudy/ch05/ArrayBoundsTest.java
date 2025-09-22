package com.example.javastudy.ch05;

public class ArrayBoundsTest {

    public static void main(String[] args) {
        char[] charArray = new char[3];

        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) (i + 'A');
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(i + " : " + charArray[i]);
        }

    }

}
