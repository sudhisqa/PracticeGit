package com.practice.collection;

import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {

		Set<Integer> set1 = new TreeSet<Integer>();
		SortedSet<Integer> set2 = new TreeSet<Integer>();
		NavigableSet<Integer> set3 = new TreeSet<Integer>();
		TreeSet<Integer> set4 = new TreeSet<Integer>();
		
		set1.add(1);
		set1.add(3);
		set1.add(2);
		set1.add(4);
		
		set2.add(3);
		set2.add(2);
		set2.add(1);
		set2.add(4);

		set3.add(1);
		set3.add(2);
		set3.add(4);
		set3.add(3);
		
		set4.add(1);
		set4.add(4);
		set4.add(3);
		set4.add(2);
		
	}
}
