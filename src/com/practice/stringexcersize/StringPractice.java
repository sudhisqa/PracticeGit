package com.practice.stringexcersize;

import java.util.stream.IntStream;

public class StringPractice {

	public static void main(String[] args) {
		
		char[] data = {'q','w','e','r','t','y','u'};
		String str = "mmm Dfmm m";
		IntStream result = str.chars();
		System.out.println(result);
	}
}
