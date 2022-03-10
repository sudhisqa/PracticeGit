package com.practice.another;

public class Pattern2 {

	public static void main(String[] args) {
		
		for(int i=1;i<5;i++) {
			for(int j=0;j<4;j++) {
				if((i+j)<=4)
				System.out.print(i+j+" ");
				else
				System.out.print(i+j-4+" ");
			}
			System.out.println("");
		}
	}
}
