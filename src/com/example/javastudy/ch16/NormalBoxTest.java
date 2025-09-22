package com.example.javastudy.ch16;

class NormalBox {
    private Object some;

    public Object getSome() {
        return some;
    }

    public void setSome(Object some) {
        this.some = some;
    }
}


public class NormalBoxTest {
    public static void main(String[] args) {
        NormalBox box = new NormalBox();
        // Object의 하위 객체면 뭐든지 담을 수 있다.
        box.setSome(1); // Integer
        box.setSome("Hello");

        // Object로 받을 수밖에 없다.
        Object some = box.getSome();
        // 런타임의 객체로 형 변환 후 사용
        if (some instanceof String) {
            String str = (String) some;
            System.out.println(str.length());
        }
    }
}
