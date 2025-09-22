package com.example.javastudy.ch14;

public class FinalTest {

    final int ma;

    public FinalTest() {
        ma = 10;
    }

    private void finalFieldTest() {
        final int age = 10;
        // The final local variable age cannot be assigned.
        // It must be blank and not using a compound assignment
        // age = 100;
    }
}

/*
class PerfectMethodClass{
    public final void perfect() {
        System.out.println("이미 완벽");
    }
}

class PerfectMethodChild extends PerfectMethodClass{
    // Cannot override the final method from PerfectMethodClass
    public void perfect() {
        System.out.println("이미 완벽");
    }
}

final class PerfectClass{}
// The type PerfectClassChild cannot subclass the final class PerfectClass
class PerfectClassChild extends PerfectClass{}
*/
