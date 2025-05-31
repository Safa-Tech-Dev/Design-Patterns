package com.coffeepoweredcrew;

import com.coffeepoweredcrew.factorymethod.notificationcreator.EmailNotificationCreator;
import com.coffeepoweredcrew.factorymethod.notificationcreator.NotificationCreator;
import com.coffeepoweredcrew.factorymethod.notificationcreator.SMSNotificationCreator;

public class Client {

	public static void main(String[] args) {

		NotificationCreator factory = new SMSNotificationCreator();
		factory.sendNotification();

		factory = new EmailNotificationCreator();
		factory.sendNotification();
	}

}
