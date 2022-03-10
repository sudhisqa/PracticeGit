package com.practice.array;

public class typesOfArray {

	public static void main(String[] args) {

		int[][] arr= {{1,2,1},{3,4,1},{5,6,1},{7,8,1},{9,1,1}};
		System.out.println(arr.length);
		
		int[][][] arr1 = {{{1,2,3},{4,5,6},{7,8,9},{2,4,6}},
						 {{3,4,5},{6,7,8},{9,7,6},{4,5,6}},
						 {{6,7,8},{3,4,5},{6,5,4},{6,7,9}},
						 {{1,2,3},{4,3,2},{3,5,7},{4,6,8}},
						 {{4,5,6},{6,7,7},{3,4,5},{4,6,8}},
						 {{5,6,7},{7,5,3},{3,6,9},{5,7,8}}};
		System.out.println(arr1.length);

	}

}
