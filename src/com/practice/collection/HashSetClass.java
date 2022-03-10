package com.practice.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class HashSetClass {

	public static void main(String[] args) {

		Collection<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		HashSet<Integer> set3 = new HashSet<Integer>();
		
		set1.add(1);
		set1.add(3);
		set1.add(2);
		set1.add(4);
		
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		
		set3.add(4);
		set3.add(2);
		set3.add(3);
		set3.add(1);
	}

}
