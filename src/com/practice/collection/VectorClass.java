package com.practice.collection;

import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		
		List<Integer> vector1 = new Vector<Integer>();
		Vector<Integer> vector2 = new Vector<Integer>();
		Stack<Integer> stack = new Stack<Integer>();
		
		vector1.add(1);
		vector1.add(3);
		vector1.add(2);
		vector1.add(4);

		System.out.println("Elements of vector-1 are "+vector1);
		
		vector2.add(3);
		vector2.add(1);
		vector2.add(2);
		System.out.println("Elements of vector-2 are "+vector2);
		
		stack.add(9);
		stack.add(1);
		stack.add(8);
		stack.add(2);
		System.out.println("Elements of stack are "+stack);
	
	}

}
