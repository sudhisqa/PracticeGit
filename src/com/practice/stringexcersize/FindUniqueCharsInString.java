package com.practice.stringexcersize;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindUniqueCharsInString {
	
	public static void main(String args[]) {
		String input = "geek for geek";
		String output = input;
		Set<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < input.length(); i++) {
			System.out.print(input.charAt(i));
			boolean v = set.add(input.charAt(i));
			if (v==false) {
				output = output.replaceAll(String.valueOf(input.charAt(i)), "");
			}
		}
		System.out.println("\nInput string with only unique chars " + output);
	}
}
