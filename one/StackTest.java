package com.one;

import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		Stack<String> stack=new Stack<>();
		//stack �������
		System.out.println(stack.toString());
		stack.push("java");
		stack.push("C++");
		stack.push("C#");
		stack.push("Good");
		
		//stack �������
		System.out.println(stack.toString());
		//�ڷ� ������
//		stack.pop();
		System.out.println(stack.pop());
		//stack �������
		System.out.println(stack.toString());
		//�ݺ����� ����ؼ� stack �ڷ� ������
		while (stack.empty()==false) {
			System.out.println(stack.pop());
		}
		//stack �������
		System.out.println(stack.toString());
		
	}
}
