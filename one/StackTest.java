package com.one;

import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		Stack<String> stack=new Stack<>();
		//stack 내용출력
		System.out.println(stack.toString());
		stack.push("java");
		stack.push("C++");
		stack.push("C#");
		stack.push("Good");
		
		//stack 내용출력
		System.out.println(stack.toString());
		//자료 꺼내기
//		stack.pop();
		System.out.println(stack.pop());
		//stack 내용출력
		System.out.println(stack.toString());
		//반복문을 사용해서 stack 자료 꺼내기
		while (stack.empty()==false) {
			System.out.println(stack.pop());
		}
		//stack 내용출력
		System.out.println(stack.toString());
		
	}
}
