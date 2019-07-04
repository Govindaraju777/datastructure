package com.friends.datastructure.internalWorkingJCF;

import java.util.HashMap;
import java.util.Map;

/*
 
https://www.geeksforgeeks.org/treemap-in-java/
 
	This class is a member of Java Collections Framework.
	The class implements Map interfaces including NavigableMap, SortedMap and extends AbstractMap
	* TreeMap in Java does not allow null keys (like Map) and thus a NullPointerException is thrown. 
	* 	However, multiple null values can be associated with different keys.
	All Map.Entry pairs returned by methods in this class and its views represent snapshots of mappings at the time they were produced. They do not support the Entry.setValue method.

Performance factors:
	TreeMap is not synchronized and thus is not thread-safe. For multithreaded environments,
	accidental unsynchronized access to the map is prevented by:
	
	SortedMap m = Collections.synchronizedSortedMap(new TreeMap(...));

*/
public class JavaTreeMapExample2 {

	public static void main(String[] args) {
		Map<String, String> map1 = new HashMap<String, String>();
		
		map1.put("z", "z-1");
		map1.put("a", "a-1");
		map1.put("A", "A-1");
		
		//System.out.println("" + map1.firsten);
		

		
	}
	
}
