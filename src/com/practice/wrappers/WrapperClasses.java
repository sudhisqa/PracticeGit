package com.practice.wrappers;

public class WrapperClasses {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c= a+10;

		System.out.println("Value of a+b is = " + a+b);
		System.out.println("Value of a+10 = "+a+10);
		System.out.println("Value of c is = " +c);
		
		Integer i = new Integer(12);
		Integer i1 = new Integer("25");
		System.out.println("Value of 'i' is = "+ i);
		System.out.println("Value of 'i1' is = "+ i1);
		
		Integer ii = i+3;
		Integer ii1 = i1+3;
		System.out.println("Value of ii is = " +ii);
		System.out.println("Value of ii1 is = " +ii1);
		
	}

}
