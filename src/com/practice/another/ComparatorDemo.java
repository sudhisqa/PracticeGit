package com.practice.another;

import java.util.TreeSet;

import com.practice.learnstatickeyword.MyComparator;

public class ComparatorDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee("Vyni", 100);
		Employee e2 = new Employee("Balaiah", 200);
		Employee e3 = new Employee("Venki", 250);
		
		TreeSet<Employee> t = new TreeSet<Employee>();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		System.out.println(t);
		
		TreeSet<Employee> t1 = new TreeSet<Employee>(new MyComparator());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		System.out.println(t1);
	}
}
