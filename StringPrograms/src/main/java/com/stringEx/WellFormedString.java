package com.stringEx;

import java.util.Stack;

public class WellFormedString {

	public static void main(String[] args) {
		String str="{[({)]}";
		Stack<Character> stack= new Stack<Character>();
		for (int i=0;i<str.length();i++)
		{
			char ch= str.charAt(i);
			if(stack.empty()) {
				stack.push(ch);
			}else if (ch=='{' || ch=='[' || ch=='(') {
				stack.push(ch);
			}else if (ch=='}' && stack.peek()=='{') {
				stack.pop();
			}else if (ch==']' && stack.peek()=='[') {
				stack.pop();
			}else if (ch==')' && stack.peek()=='(') {
				stack.pop();
			}
		}
		if (stack.empty()) {
			System.out.println("Given String is wellled formed");
		}else {
			System.out.println("Given String is not well formed");
		}
	}

}
