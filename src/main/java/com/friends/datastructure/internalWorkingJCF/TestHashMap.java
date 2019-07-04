package com.friends.datastructure.internalWorkingJCF;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * hashmap is internally backed by 
 * array of nodes : Node<K,V>[] table; with initial size of 16. load factory 9.75 i.e 75%
 * means when table is filled with 
 */
public class TestHashMap {
	public static void main(String[] args) {
		
		Map<String,String> test = new HashMap<String, String>();
		test.put("emp1","emp1");
		test.put("emp2","emp1");
		test.put("emp3","emp1");
		test.put("emp4","emp1");
		test.put("emp5","emp1");
		test.put("emp6","emp1");
		test.put("emp7","emp1");
		test.put("emp8","emp1");
		test.put("emp9","emp1");
		test.put("emp10","emp1");
		test.put("emp11","emp1");
		test.put("emp12","emp1");
		test.put("emp13","emp1");
		test.put("emp14","emp1");
		test.put("emp15","emp1"); //size of internal Node<K,V>[] doubles..
		test.put("emp16","emp1");

		test.remove("emp16");
		test.remove("emp15");
		System.out.println(test);
		test.put("emp15","emp1");
		System.out.println(test);
		
	}
}
