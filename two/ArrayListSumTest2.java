package com.two;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class ArrayListSumTest2 {
	public static void main(String[] args) {
		//ArrayList�� Ȱ���� �����Է� �հ� ��� �ο� ���ϱ�
		//-1�� �Է��ϸ� ���α׷� ����
		Scanner sc=new Scanner(System.in);
		System.out.println("�����Է�");
//		ArrayList<Integer>array=new ArrayList<Integer>();
//		Vector<Integer>array=new Vector<Integer>();
		LinkedList<Integer>array=new LinkedList<Integer>();
		//���������Է�
		int tmpNum=0;
		while (true) {
			tmpNum=sc.nextInt();
			if (tmpNum==-1) {
				System.out.println("����");
				break;
			}
			else {
				array.add(tmpNum);//����Ʈ�� ������ �߰�				
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