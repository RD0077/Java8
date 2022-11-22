package com.stringEx;

import java.util.Scanner;

public class CountNoOfWordsInString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Strring");
		String s= sc.nextLine();
		int count= countNumberOfWords(s);
		System.out.println("No words in a string is :  "+count);
	}

	private static int countNumberOfWords(String s) {
		int count=0;
		if(s.charAt(0)!=' ') {
			count++;
		}
		for(int i=0;i<s.length();i++) {
			if (s.charAt(i)==' ' && s.charAt(i+1)!= ' ') {
				count++;
			}
		}
		return count;
	}

}
