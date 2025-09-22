package com.example.javastudy.ch13;

public class SuitableTypeTest {
    public void move1(Object obj) {
        if (obj instanceof Person) {
            Person casted = (Person) obj;
            casted.move();
        }
    }

    public void move2(Person person) {
        person.move();
    }

    public void move3(SpiderMan spiderMan) {
        spiderMan.move();
    }

    public static void main(String[] args) {
        SpiderMan sman = new SpiderMan();
        Person person = new Person();
        Object obj = new Object();

        SuitableTypeTest test = new SuitableTypeTest();

        // TODO: 1. 다양한 객체를 move1에 전달해보세요.
        // END:

        // TODO: 2. 다양한 객체를 move2에 전달해보세요.
        // END:

        // TODO: 3. 다양한 객체를 move3에 전달해보세요.
        // END:

        // TODO: 4. Person 타입의 객체들을 저장할 수 있는 배열을 만들고 이동시켜보세요.
        // END:

    }

}
