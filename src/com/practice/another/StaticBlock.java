package com.practice.another;

public class StaticBlock {
	
	int i=60;
	
	static {
		int i=20;
		System.out.println(i);
	}

	public static void main(String[] args) {
		
		StaticBlock s = new StaticBlock();
		
		s.i=40;
		System.out.println(s.i);

	}

}
