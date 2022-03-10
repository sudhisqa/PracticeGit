package com.practice.learnstatickeyword;

import java.util.Locale;
import java.util.ResourceBundle;

public class MainClass {

	public static void main(String[] args) {
		
		String baseName ="com.practice.learnstatickeyword.Bundle";
		String lang= "hi";
		String country= "IN";
		
		Locale l = new Locale(lang, country);
		ResourceBundle r = ResourceBundle.getBundle(baseName, l);
		String str = r.getString("wish");
		System.out.println(str);
	}

}
