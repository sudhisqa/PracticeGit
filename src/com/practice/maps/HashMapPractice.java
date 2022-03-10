package com.practice.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapPractice {
	
	public static void main(String[] args) {
		
		Map<Integer, Integer> map = new HashMap<>();
		HashMap<Integer, Integer> map1 = new HashMap<>();
		
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
		Set<Entry<Integer, Integer>> entry = map.entrySet();
		entry.iterator().next().getKey();
	}

}
