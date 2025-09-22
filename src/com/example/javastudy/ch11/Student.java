package com.example.javastudy.ch11;

public class Student {
    // 학점: 0 ~ 100
    private int score;

    // 이름: null 일 수 없음
    String name="익명";

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        if (0 <= score && score <= 100) {
            this.score = score;
        }
    }
    
    // TODO: name에 null값이 할당될 수 없도록 encapsulation 처리하세요.
    // END:

    @Override
    public String toString() {
        return "name: " + this.name + ", score: " + this.score;
    }
}
