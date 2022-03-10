package com.practice.maps;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapPractice {

	public static void main(String[] args) {
		
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		SortedMap<Integer, Integer> map1 = new TreeMap<Integer, Integer>();
		NavigableMap<Integer, Integer> map2 = new TreeMap<Integer, Integer>();
		TreeMap<Integer, Integer> map3 = new TreeMap<Integer, Integer>();
		
		map.put(4, 401);
		map.put(8, 501);
		map.put(7, 701);
		map.put(3, 601);
		map.put(5, 101);
		map.put(9, 801);
		
		map1.putAll(map);
		map2.putAll(map);
		map3.putAll(map);
		
		System.out.println(map3.ceilingEntry(6));
		
		System.out.println(map);
		System.out.println(map1);
		System.out.println(map2);
		System.out.println(map3);

	}

}
