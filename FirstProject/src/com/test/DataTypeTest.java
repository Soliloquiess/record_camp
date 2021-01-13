package com.test;

public class DataTypeTest {
	//자동완성 : ctrl+space bar
	public static void main(String[] args) {
		//논리형: boolean
		//flag: 변수(어떤 값을 저장하는 저장소)
		
		boolean flag = true;
		
		//정수형 
		byte b = 127;//byte(-128~127) 1byte
		short s = 1000;
		int num = 100; //int:-21억~ 21억
		long l = 9999999; //8byte
		
		
		//literal(값): 정수
		//실수형
		float f= 1.2f;//4byte
		//값 자체를 리터럴이라 부른다.
//		f = l;
//		l = (long)f;
		double point =3.14;
		//문자형: 한 글자 저장.
		char code = 'a';
		num = 'Q';	//char형에 숫자 넣거나 int형에 문자(char)넣어서 출력도 가능
		code = 98;
		
		String name = "kim"; //String(문자열):참조형
		
//		System.out.println(num);
//		System.out.println(code);	
//		
//		System.out.println(name);
//		System.out.println(f);
//		System.out.println(point);
		
		System.out.printf("%d\n%s\n%s\n", num, code, name);
		
		
	}
}
