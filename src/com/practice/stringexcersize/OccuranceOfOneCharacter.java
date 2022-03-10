package com.practice.stringexcersize;

public class OccuranceOfOneCharacter {

	public static void main(String[] args) {

		String input = "Sudarshan Shenoy";
		int count = 0;
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)=='S') {
				System.out.println(input.charAt(i));
				count++;
			}
		}
		System.out.println("Occurance of 'S' input is "+count+" times");
	}

}
