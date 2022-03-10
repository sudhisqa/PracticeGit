package com.practice.another;

import com.practice.learnstatickeyword.AAA;

public class ObjectCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		AAA obj = new AAA();
		obj.i=5;
		obj.j=6;
		AAA obj1= (AAA) obj.clone();
		
		System.out.println(obj);
		System.out.println(obj1);
	}

}
