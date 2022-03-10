package com.practice.constructorinheritance;

public class B extends A{
	int number = 15;

	public B() {
	//	super(5);
		System.out.println("In default constructor B");
	}
	
	public B(int i) {
		System.out.println("In param constructor B");
	}
	
	public void show() {
		System.out.println("Inside class B");
		System.out.println(number);
		System.out.println(super.number);
	}
	
	public void showB() {
		super.show();
		System.out.println("Inside method of class B");
	}

}
