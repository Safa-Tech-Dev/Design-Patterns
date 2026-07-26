package creational.design.pattern.factory.factory.method.concretefactory;

import creational.design.pattern.factory.factory.method.concreteproduct.SMSNotification;
import creational.design.pattern.factory.factory.method.factory.NotificationFactory;
import creational.design.pattern.factory.factory.method.product.Notification;

public class SMSNotificationCreator extends NotificationFactory {
    @Override
    protected Notification createNotification() {
        return new SMSNotification();
    }
}
