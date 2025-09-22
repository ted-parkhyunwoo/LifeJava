package com.example.javastudy.ch07;

public class CallByTest {
    int memberVar = 5;

    void change1(int var) {
        var += 10;
    }

    void change2(CallByTest cbtl) {
        cbtl.memberVar += 100;
    }

    public static void main(String[] args) {
        CallByTest cbt = new CallByTest();
        cbt.change1(cbt.memberVar);
        System.out.println("change1 :" + cbt.memberVar);
        cbt.change2(cbt);
        System.out.println("change2 :" + cbt.memberVar);
    }
}
