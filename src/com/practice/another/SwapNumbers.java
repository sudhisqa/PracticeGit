package com.practice.another;

public class SwapNumbers {

	public static void main(String[] args) {
		
	/* One method;
	   This is not efficient as as here we are using one more temporary variable 
	   and wasting the memory.
		int a=4,b=5;
		int temp;
		
		temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
	*/
	/* This is another method;
	   This method is not efficient as here we are wasting one bit of memory to 
	   store a+b==9-->1001
		int a=4, b=5;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
	*/
		int a=4, b=5;
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a);
		System.out.println(b);
	}

}
