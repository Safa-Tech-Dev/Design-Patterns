package com.coffeepoweredcrew.factorymethod.conccretenotification;

public class EmailNotification implements NotificationProduct {
	
	@Override
	public void notifyUser() {
		System.out.println("Sendinng an Email Notification");
	}
}
