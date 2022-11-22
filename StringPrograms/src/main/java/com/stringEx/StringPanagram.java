package com.stringEx;

public class StringPanagram {

	public static void main(String[] args) {
		String s= "the quick brown fox jumps over the lazy dog";
		//String s="abcdefghijklmnoqrstuvwxyzzzzz";
		System.out.println(isPanagram(s));
		System.out.println(isPanagram(s.toLowerCase()));
	}

	private static boolean isPanagram(String s) {
		if (s.length()<26) {
			return false;
		}
		else {
			for(char ch='a' ; ch<='z'; ch++) {
				if(s.indexOf(ch) <0)
					return false;
			}
		}
		return true;
	}

}
