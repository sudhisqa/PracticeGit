package com.practice.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClass {

	public static void main(String[] args) {
		
		ArrayList<Integer> integer = new ArrayList<Integer>();
		integer.add(2);
		integer.add(20);
		integer.add(9);
		System.out.println("Arraylist elements are "+ integer);
		
		Set<Integer> s = new HashSet<Integer>();
		s.add(20);
		s.add(2);
		s.add(3);
		System.out.println("Hashset elements are "+ s);
		
		NavigableSet<Integer> set = new TreeSet<>(new MyComparator<Integer>());
		//NavigableSet<Integer> set = new TreeSet<>();
		set.add(3);
		set.add(10);
		set.add(20);
		set.add(9);
		set.add(11);
		set.add(2);
		set.add(8);
		set.add(4);
		set.add(7);
		set.add(6);
		System.out.println("Navigable set elements are " +set);
		
		System.out.println(set.pollLast());
		System.out.println(set);
	}

}
