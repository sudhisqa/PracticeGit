package com.practice.another;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class ArrayExample {

	public static void main(String[] args) {
		
		int a[]= {1,3,5,7,9,0};
		String s= a.toString();
		System.out.println(a[2]);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		Vector<Integer> v = new Vector<Integer>();
		
		Iterator<Integer> its = list.iterator();
		ListIterator<Integer> itr = list.listIterator();
		Enumeration<Integer> enm =v.elements();
		
	}

}
