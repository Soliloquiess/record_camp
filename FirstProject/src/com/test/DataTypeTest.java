package com.test;

public class DataTypeTest {
	//�ڵ��ϼ� : ctrl+space bar
	public static void main(String[] args) {
		//����: boolean
		//flag: ����(� ���� �����ϴ� �����)
		
		boolean flag = true;
		
		//������ 
		byte b = 127;//byte(-128~127) 1byte
		short s = 1000;
		int num = 100; //int:-21��~ 21��
		long l = 9999999; //8byte
		
		
		//literal(��): ����
		//�Ǽ���
		float f= 1.2f;//4byte
		//�� ��ü�� ���ͷ��̶� �θ���.
//		f = l;
//		l = (long)f;
		double point =3.14;
		//������: �� ���� ����.
		char code = 'a';
		num = 'Q';	//char���� ���� �ְų� int���� ����(char)�־ ��µ� ����
		code = 98;
		
		String name = "kim"; //String(���ڿ�):������
		
//		System.out.println(num);
//		System.out.println(code);	
//		
//		System.out.println(name);
//		System.out.println(f);
//		System.out.println(point);
		
		System.out.printf("%d\n%s\n%s\n", num, code, name);
		
		
	}
}
