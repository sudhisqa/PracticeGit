package com.practice.another;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		int k = 0, a = 1, b = 1, n = 0;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		n = scanner.nextInt();
		System.out.print(a + ", " + b + ", ");
		while (a+b <= n) {
			k = a + b;
			System.out.print(k + ", ");
			a = b;
			b = k;
		}
	}

}
