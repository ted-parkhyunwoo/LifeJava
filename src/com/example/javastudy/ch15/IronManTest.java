package com.example.javastudy.ch15;

interface Fightable {
    void fire();
}

interface Transformable {
    void transform();
}

interface Flyable {
    void fly();
}

// TODO: Fightable과 Transformable을 상속받는 Heroable을 만들고 void upgrade() 메서드를 추가해보세요.
// END:

class Person {}

class IronMan{
    // TODO: 02. Person을 상속받고 Heroable과 Flyable을 구현하는 IronMan 클래스를 만들어보세요.
    // END:
}

public class IronManTest {
    public static void main(String[] args) {
        IronMan iman = new IronMan();
        // TODO: 03. iman을 다양한 타입으로 참조해보세요.
        // END:
    }
}
