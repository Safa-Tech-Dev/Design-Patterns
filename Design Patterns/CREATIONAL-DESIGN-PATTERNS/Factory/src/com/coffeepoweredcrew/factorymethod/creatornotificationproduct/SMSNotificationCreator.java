package com.coffeepoweredcrew.factorymethod.creatornotificationproduct;

import com.coffeepoweredcrew.factorymethod.message.JSONMessage;
import com.coffeepoweredcrew.factorymethod.message.Message;
import com.coffeepoweredcrew.factorymethod.message.SMSNotification;

/**
 * Provides implementation for creating JSON messages
 */
public class SMSNotificationCreator extends NotificationCreator {

	@Override
	public NotificationProduct createNotification() {
		return new SMSNotification();
	}

}
