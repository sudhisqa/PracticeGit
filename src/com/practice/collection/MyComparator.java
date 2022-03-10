package com.practice.collection;

import java.util.Comparator;

public class MyComparator<Integer> implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		int i1 = (int) o1;
		int i2 = (int) o2;
		
		if(i1>i2) {
			return -1;
		}else if(i1<i2) {
			return 1;
		}else {
			return 0;
		}
	}
}
