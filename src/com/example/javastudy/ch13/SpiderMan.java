package com.example.javastudy.ch13;

public class SpiderMan extends Person {
    Spider spider = new Spider();

    boolean isSpider = false;


    public SpiderMan() {
        super("피터파커");
    }

    void fireWeb() {
        spider.fireWeb();
    }

    @Override
    public void move() {
        if (isSpider) {
            spider.move();
        } else {
            // System.out.println("걷기");
            super.move();
        }
    }

    @Override
    public String toString() {
        return super.toString() + ",[SpiderMan] isSpider?" + this.isSpider;
    }

}
