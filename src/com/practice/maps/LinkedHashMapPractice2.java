package com.practice.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapPractice2 {
	
	public static void main(String[] args) {
		
		Map<Integer, Integer> map = new LinkedHashMap<>();
		HashMap<Integer, Integer> map1 = new LinkedHashMap<>();
		LinkedHashMap<Integer, Integer> map2 = new LinkedHashMap<>();
		
		map.put(2, 201);
		map.put(4, 401);
		map.put(6, 601);
		map.put(8, 801);
		map.put(10, 1001);
		map.put(12, 1201);
		map.put(14, 1401);
		map.put(16, 1601);
		map.put(20, 2001);
		
		map1.put(2, 201);
		map1.put(4, 401);
		map1.put(6, 601);
		map1.put(10, 1001);
		map1.put(8, 801);
		map1.put(12, 1201);
		map1.put(14, 1401);
		map1.put(16, 1601);
		map1.put(20, 2001);
		
		map2.put(2, 201);
		map2.put(4, 401);
		map2.put(6, 601);
		map2.put(10, 1001);
		map2.put(8, 801);
		map2.put(12, 1201);
		map2.put(14, 1401);
		map2.put(16, 1601);
		map2.put(20, 2001);
		
	}

}
