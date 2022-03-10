package com.practice.interview;

public class Solution2 {

	public static void main(String[] args) {
		int N = 30;

		int value = solution(N);
		System.out.println("smallest number is = " + value);
	}

	public static int solution(int N) {
		int smallest = 0;
		for (int i = 0;; i++) {
			int num = i;
			int sum = 0;
			while (num != 0) {
				int rem = num % 10;
				sum = sum + rem;
				num = num / 10;
			}
			if (sum == N) {
				smallest = i;
				break;
			}
		}
		return smallest;
	}

}
