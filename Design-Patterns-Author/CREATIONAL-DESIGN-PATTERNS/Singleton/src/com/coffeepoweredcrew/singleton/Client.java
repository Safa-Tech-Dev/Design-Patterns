package com.coffeepoweredcrew.singleton;

public class Client {

	public static void main(String[] args) {

		EagerSingleton obj1 = EagerSingleton.getInstance();
		EagerSingleton obj2 = EagerSingleton.getInstance();
		System.out.println(obj1 == obj2);

		// LazyRegistryIODH singleton;
		
		
		// singleton = LazyRegistryIODH.getInstance();
		// LazyRegistryIODH singleton2 = LazyRegistryIODH.getInstance();
		// System.out.println(singleton == singleton2);
	}

}
