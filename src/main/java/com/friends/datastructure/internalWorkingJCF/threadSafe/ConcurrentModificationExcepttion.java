package com.friends.datastructure.internalWorkingJCF.threadSafe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentModificationExcepttion {
	public static void main(String args[]) {
		
		
		List<String> myList = new ArrayList<String>();

		myList.add("1");
		myList.add("2");
		myList.add("3");
		myList.add("4");
		myList.add("5");

		Iterator<String> it = myList.iterator();
		while (it.hasNext()) {
			String value = it.next();
			System.out.println("List Value:" + value);
			if (value.equals("3"))
				myList.remove(value); // throws concurrent modification exception. //solution : use list.remove();
			
				// You can use the iterator remove() function to remove the object from underlying collection object.
				// But in this case, you can remove the same object and not any other object from the list.
			
			
			
 			myList.remove("3");
				
		}
		
		//Use for loop to avoid java.util.ConcurrentModificationException
		for(int i = 0; i<myList.size(); i++){
			System.out.println(myList.get(i));
			if(myList.get(i).equals("3")){
				myList.remove(i);
				i--;
				myList.add("6");
			}
		}
		
		

		/*Map<String, String> myMap = new HashMap<String, String>();
		myMap.put("1", "1");
		myMap.put("2", "2");
		myMap.put("3", "3");

		Iterator<String> it1 = myMap.keySet().iterator();
		while (it1.hasNext()) {
			String key = it1.next();
			System.out.println("Map Value:" + myMap.get(key));
			if (key.equals("2")) {
				myMap.put("1", "4");
				// myMap.put("4", "4");
			}
		}*/

	}
}
