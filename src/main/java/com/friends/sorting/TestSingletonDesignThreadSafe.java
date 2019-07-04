package com.friends.sorting;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.friends.threads.volatileTest.SingletonDesignThreadSafe;
//https://www.callicoder.com/java-executor-service-and-thread-pool-tutorial/
//https://javarevisited.blogspot.com/2018/07/java-multi-threading-interview-questions-answers-from-investment-banks.html#axzz5koK27kZn
//http://www.java67.com/2015/07/how-to-join-two-threads-in-java-example.html
public class TestSingletonDesignThreadSafe {

	public static void main(String[] args) {
		ExecutorService executerService = null;
		executerService = Executors.newFixedThreadPool(5);

		Runnable t1 = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i <= 100; i++) {
					SingletonDesignThreadSafe singleton = SingletonDesignThreadSafe.getInstance();
					System.out.println(singleton);
				}

			}
		};

		Runnable t2 = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i <= 100; i++) {
					SingletonDesignThreadSafe singleton = SingletonDesignThreadSafe.getInstance();
					System.out.println(singleton);
				}

			}
		};

		try {
			executerService.submit(t1);
			executerService.submit(t2);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			executerService.shutdown();
		}

	}
}
