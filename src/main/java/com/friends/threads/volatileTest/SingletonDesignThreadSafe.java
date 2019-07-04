package com.friends.threads.volatileTest;

public class SingletonDesignThreadSafe {

	private static volatile SingletonDesignThreadSafe instance;

	private SingletonDesignThreadSafe() {

	}

	public static SingletonDesignThreadSafe getInstance() {
		if (instance == null) {
			// to make threadSafe
			synchronized (SingletonDesignThreadSafe.class) {
				// check again as multiple thrads can reach above step.
				if (instance == null) {
					instance = new SingletonDesignThreadSafe();
				}
			}
		}
		return instance;
	}
}
