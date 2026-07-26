package creational.design.pattern.factory.factory.method.concretefactory;

import creational.design.pattern.factory.factory.method.concreteproduct.PushNotification;
import creational.design.pattern.factory.factory.method.factory.NotificationFactory;
import creational.design.pattern.factory.factory.method.product.Notification;

public class PushNotificationCreator extends NotificationFactory {
    @Override
    protected Notification createNotification() {
        return new PushNotification();
    }
}
