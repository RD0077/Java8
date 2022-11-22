package com.stringEx;

public class ReverseWordsInAString {

	public static void main(String[] args) {
		String str="Welcome to Java World";
			// output:  World Java to Welcome	
		String splitString[]=str.split(" ");
		for(int i= splitString.length-1; i>=0; i--)
		{
			System.out.print( splitString[i]);
			System.out.print(" ");
		}
	}

}
