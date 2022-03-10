package com.practice.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListClass2 {

	public static void main(String[] args) {

		List<Integer> list = new LinkedList<Integer>();
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		list.add(1);
		list.add(4);
		list.add(2);
		list.add(5);
		list.add(3);
		list.add(1, 5);
		list.sort(new MyComparator<Integer>());
		System.out.println("List after sorting" + list);
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			int value = it.next();
			System.out.print(value + " ");
			if(value==3)
				it.remove();
		}
		System.out.println(" ");
		
		ListIterator<Integer> it1 = list.listIterator();
		while(it1.hasNext()) {
			int index = it1.nextIndex();
			int value = it1.next();
			System.out.print("("+index+","+value+")" + " ");
		}
		System.out.println(" ");
		
		ListIterator<Integer> it2 = list.listIterator();
		System.out.println(it2.next());
		it2.set(45);
		while(it2.hasNext()) {
			System.out.print(it2.next()+" ");
		}
		System.out.println(" ");
		
		System.out.println("Elements of List are "+list);
	}

}
