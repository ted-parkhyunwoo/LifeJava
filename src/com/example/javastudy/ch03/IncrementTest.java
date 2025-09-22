package com.example.javastudy.ch03;

public class IncrementTest {

    public static void main(String[] args) {
        int i = 5;
        i++; // i= 6
        System.out.println(i); // 6 출력
        ++i; // i= 7
        System.out.println(i); // 7 출력

        int j = ++i; // 전위 연산이므로 증가(i=8) 후 할당, j=8
        System.out.println(j++); // 후위 연산이므로 출력(8) 후 증가, j=9
        System.out.println(--j); // 전위 연산이므로 감소(j=8) 후 출력(8)



    }

}
