package com.practice.learnstatickeyword;

public class AAA implements Cloneable{
	
	public int i;
	public int j;
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "AAA [i=" + i + ", j=" + j + "]";
	}
}
