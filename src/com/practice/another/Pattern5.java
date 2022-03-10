package com.practice.another;

public class Pattern5 {
    public static void main(String[] args) {
		  
		  int row=6;
	    	for(int i=0;i<row;i++) {
	    		for(int j=1;j<=row+i;j++) {
	    			if (j<row-i)
	    			System.out.print("  ");
	    			else
	    			System.out.print("* ");
	    			}
	    		System.out.println();
	    		}
	    	}
		 
    	
}
