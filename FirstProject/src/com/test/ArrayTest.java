package com.test;

public class ArrayTest {

	public static void main(String[] args) {
		//배열: 선언, 생성, 사용
		int score;//선언
		score = 99;//사용
		
//		int[] scores;//선언
//		scores = new int[5]; //new 키워드로 배열 생성.
		
		int[] scores = new int[5]; //선언 + 생성
		scores[0] = 90; //사용
		scores[1] = 70;
		scores[2] = 60;
		scores[3] = 80;
		scores[4] = 100;
		
		for (int i = 0; i<scores.length; i++)
		{
			System.out.println(scores[i]);
		}
		
		//선언,생성, 초기화  한번에
		int[] scores2 = {32,58,66,79,90};
		
//		향상된 for문
		for(int s: scores2)
		{
			System.out.println(s);
		}
		//names: 배열 안에 사람이름 5개
		String[] names= {"김하나","김두나","김세나","김네나","김오나"};
		for(String name: names)
		{
			System.out.println(name);
		}
		
		System.out.println(names.length);
	}
}
