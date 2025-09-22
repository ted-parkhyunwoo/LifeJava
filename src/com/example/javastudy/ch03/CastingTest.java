package com.example.javastudy.ch03;

public class CastingTest {

    public static void main(String[] args) {
       byte b1 = 10;
       byte b2 = 20;
       // byte result1 = b1 + b2; // Type mismatch: cannot convert from int to byte

       // 내부 동작
       // byte result1 = (int)b1 + (int)b2;
       
       byte result1 = (byte)(b1 + b2);
       System.out.println(result1);
       
       int i1 = 100;
       long l1 = 200;
       
       //int result2 = i1 + l1; // Type mismatch: cannot convert from long to int
       // 내부 동작
       //int result = (long)i1 + l1;
       
       int result2 = (int)(i1 + l1);
       System.out.println(result2);
    }

}
