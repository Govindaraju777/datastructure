package com.friends.sapiensInt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyClass {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2, 4, 5, 1, 3, 2);
		Set<Integer> numberSet = new HashSet<>(numbers);
		for (Integer num : numberSet) {
			System.out.print(" " + num);
		}
		/*
		 * 
		 * output a) 12345 b) 245132 c) 24513 Cannot predict.
		 */

		Set<Integer> nums2 = new HashSet<>();
		nums2.add(3);
		nums2.add(1);
		nums2.add(4);
		nums2.add(5);
		nums2.add(3);
		System.out.println("nums2=" + nums2);

		// Creating a HashSet
		HashSet<String> set = new HashSet<String>();

		// Adding elements into HashSet using add()
		set.add("a");
		set.add("c");
		set.add("b");
		set.add("z");
		set.add("a");

		System.out.println("Original HashSet: " + set);

		// Sorting HashSet using List
		List<String> list = new ArrayList<String>(set);
		Collections.sort(list);

		// Print the sorted elements of the HashSet
		System.out.println("HashSet elements " + "in sorted order " + "using List: " + list);

		
		
		
		
		
		
		
		List<Integer> numbersDivisibleBy5 = new ArrayList<>();
        numbersDivisibleBy5.add(5);
        numbersDivisibleBy5.add(10);
        numbersDivisibleBy5.add(15);
        numbersDivisibleBy5.add(20);
        numbersDivisibleBy5.add(25);

		// Creating a HashSet from another collection (ArrayList)
        Set<Integer> numbersDivisibleBy5Or3 = new HashSet<>(numbersDivisibleBy5);
        System.out.println(numbersDivisibleBy5Or3);
		
	}

}
