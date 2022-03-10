package com.practice.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsClass {

	public static void main(String[] args) {
		
		List<Integer> c = new ArrayList<Integer>();
		c.add(4);
		c.add(2);
		c.add(1);
		c.add(2);
		
		Set<Integer> c1 = new HashSet<Integer>();
		c1.add(41);
		c1.add(21);
		c1.add(12);
		c1.add(34);
		
		int[] elements = {12,32,34,53};

		int values = Collections.max(c);
		
		Collections.swap(c, 0, 3);
		
		System.out.println(values);
		System.out.println(c);

	}

}
