package com.coffeepoweredcrew.factorymethod.creatornotificationproduct;



import com.coffeepoweredcrew.factorymethod.message.EmailNotification;
import com.coffeepoweredcrew.factorymethod.message.Message;
import com.coffeepoweredcrew.factorymethod.message.TextMessage;

/**
 * Provides implementation for creating email notification
 */
public class EmailNotificationCreator extends NotificationCreator {

	@Override
	public NotificationProduct createNotification() {
		return new EmailNotification();
	}



}
