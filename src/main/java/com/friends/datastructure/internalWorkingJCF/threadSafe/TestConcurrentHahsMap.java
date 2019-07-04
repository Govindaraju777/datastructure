package com.friends.datastructure.internalWorkingJCF.threadSafe;

import java.util.concurrent.ConcurrentHashMap;

/*
 https://javarevisited.blogspot.com/2017/08/how-to-create-thread-safe-concurrent-hashset-in-java-8.html
 
 Difference between HashMap and ConcurrentHashMap
HashMap is the Class which is under Traditional Collection and ConcurrentHashMap is a Class which is under Concurrent Collections, apart from this there are various differences between them which are:

HashMap is non-Synchronized in nature i.e. HashMap is not Thread-safe whereas ConcurrentHashMap is Thread-safe in nature.
HashMap performance is relatively high because it is non-synchronized in nature and any number of threads can perform simultaneously. But ConcurrentHashMap performance is low sometimes because sometimes Threads are required to wait on ConcurrentHashMap.
While one thread is Iterating the HashMap object,
 if other thread try to add/modify the contents of Object then we will get Run-time exception saying ConcurrentModificationException.Whereas In ConcurrentHashMap we wont get any exception while performing any modification at the time of Iteration.


 */
public class TestConcurrentHahsMap extends Thread {
	static ConcurrentHashMap<Integer, String> l = new ConcurrentHashMap<Integer, String>();

	Object obj;
	
	public static void main(String[] args) throws InterruptedException {
		l.put(100, "A");
		l.put(101, "B");
		l.put(102, "C");
		TestConcurrentHahsMap t = new TestConcurrentHahsMap();
		t.start();

		for (Object o : l.entrySet()) {
			Object s = o;
			System.out.println(s);
			Thread.sleep(1000);
		}
		System.out.println(l);
	}
}
