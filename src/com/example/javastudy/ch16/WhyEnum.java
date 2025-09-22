package com.example.javastudy.ch16;

public class WhyEnum {

    enum Seasons {
        SPRING, SUMMER, AUTUMN, WINTER
    }

    private static final int SPRING = 0;
    private static final int SUMMER = 1;

    private static final int JANUARY = 1;

    public void printSeasonNormal(int season) {
        if (season == SPRING) {
            System.out.println("봄!");
        } else if (season == SUMMER) {
            System.out.println("여름!");
        }
    }



    public void printSeasonEnum(Seasons season) {
        if (season.equals(Seasons.SPRING)) {
            System.out.println("봄!");
        } else if (season.equals(Seasons.SUMMER)) {
            System.out.println("여름!");
        }
    }


    public static void main(String[] args) {
        WhyEnum we = new WhyEnum();
        we.printSeasonNormal(SUMMER);
        we.printSeasonNormal(JANUARY);
    }

}
