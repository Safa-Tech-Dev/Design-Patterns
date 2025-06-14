package com.coffeepoweredcrew.factorymethod.creatornotificationproduct;

/**
 * This is our abstract "creator". 
 * The abstract method createNotification() has to be implemented by
 * its subclasses.
 */
public abstract class NotificationCreator {

	//Factory method
	public abstract NotificationProduct createNotification();

	public void sendNotification() {
		NotificationProduct notification = createNotification();
		
		notification.notifyUser();
	}
	
	
}
