package com.practice.collection;

import java.util.Arrays;
import java.util.List;

public class ArraysClass {

	public static void main(String[] args) {
		
		Integer[] elements = {12,8,32,11,34,5,53,6,24,13};
		
		List<Integer> list = Arrays.asList(elements);
		list.set(2, 90);
		
		String ele = Arrays.toString(elements);
		System.out.println("String represenation is "+ ele);
		for(Integer e: elements) {
			System.out.print(e+" ");
		}
	//	Arrays.fill(elements, 9);
		
		/*
		 * for(Integer element: elements) { System.out.print(element+" "); }
		 * System.out.println("");
		 */
		
		/*
		 * for(Integer c: copy) { System.out.print(c+" "); } System.out.println("");
		 */
		
		//System.out.println(list);

	}

}
