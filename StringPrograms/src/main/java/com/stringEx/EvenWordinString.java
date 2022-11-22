package com.stringEx;

public class EvenWordinString {

	public static void main(String[] args) {
		String str = "hell world slkfdh lkhsflkdjhs slkdfhjlks ";
		for (String s : str.split(" ")) {
			if (s.length() % 2 == 0) {
				System.out.println(s);
			}
		}
	}

}
