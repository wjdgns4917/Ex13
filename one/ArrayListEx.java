package com.one;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
	public static void main(String[] args) {
		//���ڿ��� ���� ������ ArryList����
		ArrayList<String>a=new ArrayList<String>();
		
		//Ű����κ��� 4���� �̸� �Է¹޾� ArrayList�� ����
		Scanner sc=new Scanner(System.in);//Scanner ��ü ����
		for (int i = 0; i < 4; i++) {
			System.out.println("�̸��� �Է��ϼ���>>");
			String s=sc.next();//Ű����κ��� �̸��� �Է�
			a.add(s);//ArrayList�÷��ǿ� ����
		}
		//ArrayList�� ����ִ� ����̸� ���
		for (int i = 0; i < a.size(); i++) {
			String name=a.get(i);//ArrayList�� i��° ���ڿ� ������
			System.out.print(name+" ");
			System.out.println(a.get(i).length());
		}
		//���� ���̸� ���
		int longstIndex=0;//���� ���� ���̸��� �ִ� ArrayList���� �ε���
		for (int i = 1; i < a.size(); i++) {
			if(a.get(longstIndex).length()<a.get(i).length())//�̸� ���� ��
				longstIndex=i;//i��° �̸��� �� ���̸���
		}
		System.out.println("\n���� �� �̸��� : "+a.get(longstIndex));
		sc.close();
	}
}
