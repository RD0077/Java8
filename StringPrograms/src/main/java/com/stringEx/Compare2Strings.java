package com.stringEx;

public class Compare2Strings {

	public static void main(String[] args) {
		String str1="abcdef";
		String str2="abcdef";
		boolean compare=true;
		for(int i =0 ;i<str1.length(); i++) {
			if(str1.charAt(i)!= str2.charAt(i))
			{
				compare=false;
				break;
			}
			compare=true;
		}
		if (compare)
			System.out.println("Strigs are equal");
		else
			System.out.println("Strings are not equal");
	}

}
