package com.practice.collection;

import java.util.ArrayList;
import java.util.Collection;

public class collectionClass {

	public static void main(String[] args) {

		Collection<Integer> collection1 = new ArrayList<>();

		Collection<Integer> collection2 = new ArrayList<>();

		Integer[] arr1 = new Integer[3];

		collection1.add(1);
		collection1.add(5);
		collection1.add(2);
		collection1.add(6);
		collection1.add(3);
		collection1.add(7);
		collection1.add(4);
		collection1.add(8);
		collection1.add(1);

		collection1.add(null);

		collection2.add(1);
		collection2.add(3);
		collection2.add(5);
		collection2.add(7);

		System.out.println("Elements of collection-1 " + collection1);
		System.out.println("Elements of collection-2 " + collection2);

		System.out.println(collection1.isEmpty());

		Integer[] arr = collection2.toArray(arr1);
		arr[3] = 50;
		// arr[4] = 0; Since the size of the array is less than size of the collection,
		// jvm allocates array with the
		// specified type (here int) and with size of the collection. So, adding 5th
		// element gives exception.

		System.out.println("Length of array arr = " + arr.length);
		System.out.println("Elements of array collection coverted to array:");

		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println(arr[0] + 1);
	}

}
