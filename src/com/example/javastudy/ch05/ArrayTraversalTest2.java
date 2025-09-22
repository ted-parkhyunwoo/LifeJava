package com.example.javastudy.ch05;

public class ArrayTraversalTest2 {

    public static void main(String[] args) {
        int[][] points = {{10, 0, 30}, {0, 200}};

        for (int i = 0; i < points.length; i++) {
            System.out.println(points[i]); // 1차원 배열의 주소값
        }

        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                System.out.print(points[i][j] + "\t");
            }
            System.out.println();
        }

        for (int[] row : points) {
            for (int elem : row) {
                System.out.print(elem + "\t");
            }
            System.out.println();
        }
    }

}
