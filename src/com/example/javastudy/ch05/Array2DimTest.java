package com.example.javastudy.ch05;

public class Array2DimTest {

    public static void main(String[] args) {
        int[][] points = new int[2][]; // int []을 관리하는 크기 2인 배열 points
        points[0] = new int[3]; // int 3개짜리 배열 생성 후 points의 0번째 요소로 할당
        points[1] = new int[2]; // int 2개짜리 배열 생성 후 points의 0번째 요소로 할당

        points[0][0] = 10; // points의 0번째 요소의 0번째 요소에 10 할당
        points[0][2] = 30;
        points[1][1] = 200;

        int[][] points1 = {{10, 0, 30}, {0, 200}};

        int[][] points2 = new int[2][3];
        points2[0][0] = 10;
        points2[0][1] = 20;
        points2[1][2] = 30;
    }

}
