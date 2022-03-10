package com.practice.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueClass {

	public static void main(String[] args) {
		
		MyComparator<Integer> comparator = new MyComparator<Integer>();
		
		Queue<Integer> q = new PriorityQueue<Integer>(comparator);
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		q.add(5);
		q.add(1);
		q.add(2);
		q.add(4);
		q.add(3);
		
		pq.add(3);
		pq.add(1);
		pq.add(2);
		pq.add(4);
		pq.add(5);
		
		System.out.println(q);
		System.out.println(pq);

	}

}
