package com.friends.datastructure.internalWorkingJCF.threadSafe;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/*
 * 
 http://www.java67.com/2015/06/difference-between-synchronized-arraylist-and-copyOnWriteArrayList-java.html
 
 The CopyOnWriteArrayList leverages this knowledge and provides reading without a lock, 
 which means a much better performance if there are more reader 
 threads and write is happening quite low. 
 In short, the main difference between synchronized ArrayList 
 and CopyOnWriteArrayList comes from the fact how they achieve thread safety 
 and how scalable they are.


Synchronized List vs CopyOnWriteArrayList
Initially, when Java comes with Collection framework, instead of variants of classes they provide wrappers using java.util.Collections class, for example, if you need a read-only ArrayList, you can get it by calling Collections.unmodifiableList(), similarly if you need a synchronized list you can get by calling Collections.synchronizedList().



 * 
 */
public class TestCopyOnWriteArrayList {
	public static void main(String[] args) {

		List<String> names = new CopyOnWriteArrayList<>();
		names.add("test1");
		names.add("test2");

		Thread t1 = new Thread(() -> {
			Iterator<String> nameIterator = names.iterator();
			while (nameIterator.hasNext()) {
				try {
					synchronized (names) {
						System.out.println("T1:" + nameIterator.next());
						// names.wait();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i <= 10; i++) {
				try {
					synchronized (names) {
						names.add("c" + i);
						System.out.println("T2 - " + names);
						// Thread.sleep(1000);
						// names.notifyAll();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		t1.start();
		t2.start();

	}

}
