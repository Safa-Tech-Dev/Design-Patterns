package com.coffeepoweredcrew.singleton;
/**
 * This class uses eager initialization of singleton instance.
 */
public class EagerSingleton {

	// Step 1: Create the instance at the time of class loading
	private static final EagerSingleton INSTANCE = new EagerSingleton();
	
	// Step 2: Private constructor to prevent external instantiation
	private EagerSingleton() {

		System.out.println("Eager Singleton instance created...");
		
	}
	
	// Step 3: Global access point
	public static EagerSingleton getInstance() {
		return INSTANCE;
	}
}