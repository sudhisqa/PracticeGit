package com.practice.another;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListSorting {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int k = 7; k < 20; k++) {
			if ((k % 2) != 0) {
				list.add(k);
			}
		}
		System.out.println(list.size());
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the new number to be inserted in sorted order");
		int n = scanner.nextInt();
		int m = list.size();
		int j = 0;
		for (int i = 0; i < m; i++) {
			if ((list.get(i)) <= n) {

				if ((i + 1) < m) {

					if ((list.get(i + 1)) > n) {
						j = i + 1;
						break;
					}
					continue;
				}
				j = i + 1;
			}
			break;
		}
		list.add(j, n);
		System.out.println(list);
	}

}
