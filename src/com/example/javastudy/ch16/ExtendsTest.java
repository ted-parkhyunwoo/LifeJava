package com.example.javastudy.ch16;

class NumberBox<T extends Number> {

    public void addSomes(T... ts) {
        double d = 0;
        for (T t : ts) {
            d += t.doubleValue();
        }
        System.out.println("총 합은: " + d);
    }
}


public class ExtendsTest {

    public static void main(String[] args) {
        // TODO: Number의 하위 타입을 받아서 처리하도록 구성해보세요.
        // END:

        // TODO: Integer의 하위 타입을 받아서 처리하도록 구성해보세요.
        // END:

        // TODO: String의 하위 타입을 받아서 처리하도록 구성해보세요.
        // END:
    }
}

