package com.practice.practicepolymorphism;

public class PracticeChild extends PracticePolymorphism {
	
	public void method() {
		System.out.println("inside method for practice child");
	}
	
	/*
	 * This can't be overrided as show() is final in super class.
	 * public void show() {
	 * 
	 * }
	 */

}
