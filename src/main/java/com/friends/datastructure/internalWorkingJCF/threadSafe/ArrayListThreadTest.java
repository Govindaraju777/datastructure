package com.friends.datastructure.internalWorkingJCF.threadSafe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/*
 * Exception in thread "Thread-1" java.util.ConcurrentModificationException
 */
public class ArrayListThreadTest {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("test1");
		names.add("test2");

		

		Thread t1 = new Thread(() -> {
			Iterator<String> nameIterator = names.iterator();
			while(nameIterator.hasNext()) {
				System.out.println(nameIterator.next());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		});
		
		Thread t2 = new Thread(() -> {
			int i = 0;
			for (i = 0; i <= 10; i++) {
				try {
					names.add("c" + i);
					System.out.println("T1 - " + names);
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		t1.start();
		t2.start();

	}

}
