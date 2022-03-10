package com.practice.constructorinheritance;

public class A {
	
	int number = 10;
	
	public A() {
		System.out.println("In default constructor A");
	}
	
	public A(int i) {
		System.out.println("In param constructor A");
	}
	
	public void show() {
		System.out.println("Inside class A");
	}

}
