package com.example.javastudy.ch10;

public class SpiderMan extends Person {
    Spider spider = new Spider();
    // TODO: 1. 스파이더맨의 생태를 설정하는 변수를 추가하세요.
    // END:
    
    public SpiderMan() {
        super("피터파커");
    }
    
    public SpiderMan(String name) {
        super(name);
    }


    // TODO: 2. move를 재정의 하세요.
    // END:

    // TODO: 6. toString()을 재정의 하세요.
    // END:
    

    void fireWeb() {
        spider.fireWeb();
    }

}
