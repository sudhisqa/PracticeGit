package com.practice.another;

public class String1 {

	public static void main(String[] args) {
		
		String str = "Hello";
		str.toUpperCase();
		System.out.println(str);
		
		str+="WORLDOFJAVA";
		System.out.println(str);
		
		String string = str.substring(2, 13);
		System.out.println(string);
		String s = string+str.charAt(4);
		System.out.println(s);
	}

}
