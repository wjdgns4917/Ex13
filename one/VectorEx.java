package com.one;

import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		Vector<Integer>v=new Vector<Integer>(); //�������� �ٷ�� ���� ����
		v.add(5); //5����
		v.add(4); //4����
		v.add(-1); //-1����
		
		//���� �߰��� ����
		v.add(2, 100); //4�� -1���̿� ���� 100����
		
		System.out.println("���ͳ��� ��Ұ�ü�� : "+v.size());//ũ��3
		System.out.println("������ ���� �뷮 : "+v.capacity());//���Ϳ뷮10
		
		//��� ��� ���� ���
		for (int i = 0; i < v.size(); i++) {
			int n=v.get(i); //������ i��° ����
			System.out.println(n);
		}
		
		//���ͼ��� ��� ���� ���ϱ�
		int sum=0;
		for (int i = 0; i < v.size(); i++) {
			int n=v.elementAt(i);//������ i��° ����
			sum+=n;
		}
		System.out.println("���Ϳ� �ִ� ������ : "+sum);
	}
	
}
