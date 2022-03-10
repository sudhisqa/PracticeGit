package com.practice.stringexcersize;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CharacterOccuranceInString {

	public static void main(String[] args) {

		String input = "Sudarshan Shenoy";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] characterArray = input.toCharArray();
		
		for(char character:characterArray) {
			if(map.containsKey(character)) {
				Integer previouseValue = map.get(character);
				map.put(character, previouseValue+1);
			}else {
				map.put(character, 1);
			}
		}
		
		for(Entry<Character, Integer> entry:map.entrySet()) {
			System.out.println("The character "+entry.getKey()+" occured "+entry.getValue()+"times");
		}
	}

}
