package com.practice.learnstatickeyword;

public class LearmingStatic {
	
	//final int a=10;
	static int constant=8;
	
	public static String  show() {
		String a = "'tt";
		System.out.println("value of a is="+a);
		return a;
	}

	public static void main(String[] args) {
		
		LearmingStatic learn = new LearmingStatic();
		LearmingStatic learn1 = new LearmingStatic();
		learn.constant=9;
		System.out.println(learn.constant);
		learn1.constant=10;
		System.out.println(learn1.constant);
		System.out.println(learn.constant);
//		System.out.println(learn.a);
//		LearmingStatic.show();
//		System.out.println(learn.a);
//		LearmingStatic.show();
//		System.out.println(constant);
//		constant =9;
//		System.out.println(constant);
		
	}

}
