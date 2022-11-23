package com.stringEx;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		char c= getFirstNonRepetingChar("asdkjklajsdajfhsjkdfjh");
		System.out.println(c);
	}

	private static char getFirstNonRepetingChar(String string) {
		Map<Character, Integer> countMap= new LinkedHashMap<Character, Integer>();
		for(char ch: string.toCharArray()) {
			countMap.put(ch, countMap.containsKey(ch)?countMap.get(ch)+1:1);
		}
		for(Entry<Character, Integer> entry:countMap.entrySet()) {
			if(entry.getValue()==1) {
				entry.getKey();
			}
		}
		throw new RuntimeException("Did't find non reapeating character");
	}

}
