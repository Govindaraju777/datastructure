package com.friends.datastructure.internalWorkingJCF;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class JavaTreeMapExample {
	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<Integer, String>();
		map.put(10, "10");
		//map.put(null, "10"); // java.lang.NullPointerException
		map.put(1, "1");
		map.put(5, "5");
		System.out.println(map);
		
		//with comparator.
		map = new TreeMap<Integer, String>(new Comparator<Integer>() {
			public int compare(Integer x, Integer y) {
				return (x > y) ? -1 : ((x == y) ? 0 : 1);
			}
		});
		
	}
}
