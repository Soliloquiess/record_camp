package com.test;

public class ArrayTest {

	public static void main(String[] args) {
		//�迭: ����, ����, ���
		int score;//����
		score = 99;//���
		
//		int[] scores;//����
//		scores = new int[5]; //new Ű����� �迭 ����.
		
		int[] scores = new int[5]; //���� + ����
		scores[0] = 90; //���
		scores[1] = 70;
		scores[2] = 60;
		scores[3] = 80;
		scores[4] = 100;
		
		for (int i = 0; i<scores.length; i++)
		{
			System.out.println(scores[i]);
		}
		
		//����,����, �ʱ�ȭ  �ѹ���
		int[] scores2 = {32,58,66,79,90};
		
//		���� for��
		for(int s: scores2)
		{
			System.out.println(s);
		}
		//names: �迭 �ȿ� ����̸� 5��
		String[] names= {"���ϳ�","��γ�","�輼��","��׳�","�����"};
		for(String name: names)
		{
			System.out.println(name);
		}
		
		System.out.println(names.length);
	}
}
