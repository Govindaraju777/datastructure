package com.friends.datastructure.internalWorkingJCF.threadSafe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


/*
  
 	In order to use ArrayList in such environment, 
 	you need to first get a synchronized list by calling Collections.synchronizedList().

	This list achieves thread-safety by locking the whole collection, 
	which means if one thread is reading from the List and other is also reading from a list,
	 they will go one by one, but you know that multiple threads can read from an object without any issue.

    Synchronized List vs CopyOnWriteArrayList
	Initially, when Java comes with Collection framework, 
	instead of variants of classes they provide wrappers using java.util.Collections class,
	for example, if you need a read-only ArrayList, you can get it by calling Collections.unmodifiableList(), 
	similarly if you need a synchronized list you can get by calling Collections.synchronizedList().

	This has worked well in past but with time Java applications get more sophisticated and when these classes are exposed in truly concurrent environments, they prove to become bottleneck.  Once Java folks realize this fact they were in need of collections which are more scalable and can give more performance if used in a multi-threaded environment and then comes Java 5 with the new set of collection classes called Concurrent Collections.


 */
public class TestSynchronizedList {

	public static void main(String[] args) throws InterruptedException {
		// java 7 anonymous mehtod implementation
		List<Integer> syncCollection1 = Collections.synchronizedList(new ArrayList<>());
		Runnable listOperations1 = new Runnable() {
			@Override
			public void run() {
				syncCollection1.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));
			}
		};
		Thread thread1 = new Thread(listOperations1);
		Thread thread2 = new Thread(listOperations1);
		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();
		System.out.println(syncCollection1.size());

		System.out.println("-------------------------Java 8 -----------------------");

		Collection<Integer> syncCollection2 = Collections.synchronizedCollection(new ArrayList<>());
		Runnable listOperations2 = () -> {
			syncCollection2.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));
		};

		Thread thread2_1 = new Thread(listOperations2);
		Thread thread2_2 = new Thread(listOperations2);
		thread2_1.start();
		thread2_2.start();
		thread2_1.join();
		thread2_2.join();
		System.out.println(syncCollection2.size());
		// assertThat(syncCollection.size()).isEqualTo(12);
	}
}
