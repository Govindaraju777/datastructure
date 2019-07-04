package com.friends.datastructure.internalWorkingJCF.threadSafe;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestSynchronizedSet_SynchronizedTreeSet {
	public static void main(String[] args) {
		Set<String> syncTest = Collections.synchronizedSet(new HashSet());

		syncTest.add("a");
		syncTest.add("a");
		System.out.println(syncTest);
		
		Set<String> syncSortedTreeSet = Collections.synchronizedSortedSet(new TreeSet<>()) ;

	}
}
