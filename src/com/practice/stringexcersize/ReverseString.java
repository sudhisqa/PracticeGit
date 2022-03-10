package com.practice.stringexcersize;

public class ReverseString {

	public static void main(String[] args) {
		String input = "Sudarshan";
		System.out.println(input);
		String output = "";
		char[] arr = input.toCharArray();
		for (int i = (arr.length) - 1; i >= 0; i--) {
			String c = String.valueOf(arr[i]);
			output = output.concat(c);
		}
		System.out.println(output);
	}
}
