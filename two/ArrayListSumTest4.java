package com.two;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class ArrayListSumTest4 {
	public static void main(String[] args) {
		//ArrayList를 활용한 점수입력 합계 평균 인원 구하기
		//-1을 입력하면 프로그램 종료
		Scanner sc=new Scanner(System.in);
		System.out.println("점수입력");
//		ArrayList<Integer>array=new ArrayList<Integer>();
//		Vector<Integer>array=new Vector<Integer>();
		LinkedList<Integer>array=new LinkedList<Integer>();
		//무한점수입력
		int tmpNum=0;
		while (true) {
			tmpNum=sc.nextInt();
			array.add(tmpNum);//리스트에 데이터 추가				
			if (tmpNum==-1) {
				System.out.println("종료");
				Collections.reverse(array);
				array.remove(0);
				Collections.reverse(array);				
				break;
			}
		}
//		int sizeNum=array.size();
//		array.remove(array.size()-1);
		
		int sum=0;
		float avg=0.0f;
		//sum계산
		for (int i = 0; i < array.size(); i++) {
			sum+=array.get(i);
		}
		avg=(float)sum/array.size();
		//결과출력
		System.out.println("인원 : "+array.size());
		System.out.println("총합 : "+sum);
		System.out.println("평균 : "+avg);
		
		
	}
}
