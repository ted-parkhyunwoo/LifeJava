package com.example.javastudy.ch08;

public class Phone {
    static String manufacture = "ㅇㅇ기업"; // 클래스 변수
    String number; // 멤버 변수
    String lastCall;

    public void printInfo() {
        System.out.println("제조:" + manufacture + ", 번호:" + number);
    }

    public Phone(String number) {
        this.number = number;
    }

    public void call(String to) {
        this.lastCall = to;
        String msg = this.number + "에서 " + to + "에게 전화";
        System.out.println(msg);
    }

    public void call() {
        System.out.println("재다이얼");
        this.call(this.lastCall);
    }

    public static void main(String[] args) {
        // TODO: 1. Phone의 manufacture를 '모모전자'로 변경해보세요.
        // END:

        // TODO: 2. Phone 타입의 객체 두 개를 생성해서 printInfo를 호출해보세요.
        // END:
        
        // TODO: 3. p1을 통해 manufacture를 'XX기업'으로 변경해보고 다시 printInfo를 호출해보세요.
        // END:
    }
}
