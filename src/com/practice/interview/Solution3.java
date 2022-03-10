package com.practice.interview;

import java.util.Arrays;
import java.util.List;

public class Solution3 {

	public static void main(String[] args) {
		Integer[] a = { -3, -1, -8, 0, 2, 5 };

		Object value = solution(a);
		System.out.println("smallest positive number missing is = " + value);
	}

	public static Object solution(Integer[] a) {
		Object smallest = 1;
		Integer[] array = Arrays.copyOf(a, a.length);
		int arrayLength = array.length;
		Arrays.sort(array);
		if (array[0] > 1 || array[arrayLength - 1] <= 0) {
			smallest = 1;
		} else {
			List<Integer> list = Arrays.asList(array);
			int first = list.get(0);
			int last = list.get(list.size() - 1);
			for (int i = first + 1; i < last; i++) {
				if (!list.contains(i) && (i > 0)) {
					smallest = i;
					break;
				}
				if (i == last - 1) {
					smallest = "No missing number";
				}
			}
		}
		return smallest;
	}
}
