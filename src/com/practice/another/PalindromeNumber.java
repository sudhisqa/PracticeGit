package com.practice.another;

import java.util.Scanner;

public class PalindromeNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number!");
		int n= scanner.nextInt();
		int original=n;
		int r, reversed=0;
		
		while(n!=0) {
		r=n%10;
		n=n/10;
		reversed=(reversed*10)+r;
		}
		if((original-reversed)==0) {
			System.out.println("The number is palindrome");
		}
		else
			System.out.println("The number is not palindrome");
		
		
	}

}
