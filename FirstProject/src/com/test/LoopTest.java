package com.test;

public class LoopTest {

	public static void main(String[] args) {

		String msg = "hello";
		//for (�ʱⰪ:���ǽ�:������){}
		for(int i = 0; i<5 ;i++) 
		{
//			System.out.println(i+"."+msg);
//			printf("����� ���� ����", ����� ��)
			
			System.out.printf("%d.%s\n",i,msg); //printf(format)
//			�� ������ ���  ����+���ڿ� �������� ���
		}
		
		//while
		int num = 0; //�ʱⰪ
		
		while(num < 5)
		{
			System.out.println("gogogo");//�ݺ�����
			num++;//������
		}
		//do~while
		int code = 100;	//�ʱⰪ
		do{
			//�ݺ�����.
			System.out.println("welcome");
			code++;
		}while(code < 5);
		
	}
}
