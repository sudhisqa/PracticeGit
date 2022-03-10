package com.practice.another;

public class Pattern4 {

	public static void main(String[] args) {

		//int k = 65;
		char alphabet = 'A', last = 'E';
		System.out.println(last-alphabet);
		for (int i = 0; i < last - 'A' + 1; i++) {
			for (int j = 0; j <= i; j++) {
				// char l= (char)(k+i);
				// System.out.print(l+" ");
				System.out.print(alphabet + " ");
			}
			++alphabet;
			System.out.println("");
		}
	}

}
