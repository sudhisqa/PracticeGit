package com.practice.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution1 {

	public static void main(String[] args) {
		int n = -5859;

		int value = solution(n);
		System.out.println("smallest positive number missing is = " + value);
	}

	public static int solution(int n) {
		int retVal = 0;
		int num = n;

		List<Integer> list1 = new ArrayList<Integer>();

		if (n > 0) {
			while (num != 0) {
				int rem = num % 10;
				num = num / 10;
				list1.add(rem);
			}
			Collections.reverse(list1);

			for (int i = 0; i < list1.size(); i++) {
				if (list1.get(i) == 5) {
					list1.remove(i);
					break;
				}
			}
			for (int i = 0; i < list1.size(); i++) {
				retVal = (retVal * 10) + list1.get(i);
			}
		} else {
			while (num != 0) {
				int rem = num % 10;
				rem = rem * -1;
				num = num / 10;
				list1.add(rem);
			}
			Collections.reverse(list1);

			for (int i = list1.size() - 1; i >= 0; i--) {
				if (list1.get(i) == 5) {
					list1.remove(i);
					break;
				}
			}
			for (int i = 0; i < list1.size(); i++) {
				retVal = (retVal * 10) + list1.get(i);
			}
			retVal = retVal * -1;
		}
		return retVal;
	}

}
