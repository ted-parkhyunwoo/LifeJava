package com.example.javastudy.ch02;

public class CharTest {

	public static void main(String[] args) {
		char first1 = 'A';
		char first2 = '\u0041'; // \u0041은 16진수 이며 10진수로는 65, char로는 'A'

		System.out.println(first1 + " : " + first2); // A : A

		char second = (char) (first1 + 1); // 65+1  =66 => B에 매핑
		char small = (char) (first1 + 32); // 65+32 =97 => a에 매핑

		System.out.println(second + " : " + (small + 0));

		char c1 = '\n';

	}

}
