package com.coffeepoweredcrew.factorymethod.conccretenotification;

public class SMSNotification implements NotificationProduct {

	@Override
	public void notifyUser() {
		System.out.println("Sendinng an SMS Notification");
	}
	
}
