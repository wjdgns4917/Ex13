package com.two;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSumTest {
	public static void main(String[] args) {
		//ArrayList�� Ȱ���� �����Է� �հ� ��� �ο� ���ϱ�
		//-1�� �Է��ϸ� ���α׷� ����
		Scanner sc=new Scanner(System.in);
		System.out.println("�����Է�");
		ArrayList<Integer>array=new ArrayList<Integer>();
		//���������Է�
		int tmpNum=0;
		while (true) {
			tmpNum=sc.nextInt();
			array.add(tmpNum);//����Ʈ�� ������ �߰�
			if (tmpNum==-1) {
				System.out.println("����");
				break;
			}
		}
		int sum=0;
		float avg=0.0f;
		//sum���
		for (int i = 0; i < array.size(); i++) {
			sum+=array.get(i);
		}
		avg=(float)sum/array.size();
		//������
		System.out.println("�ο� : "+array.size());
		System.out.println("���� : "+sum);
		System.out.println("��� : "+avg);
		
		
	}
}
