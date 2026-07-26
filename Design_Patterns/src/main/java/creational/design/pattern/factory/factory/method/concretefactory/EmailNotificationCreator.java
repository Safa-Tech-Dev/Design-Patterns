package creational.design.pattern.factory.factory.method.concretefactory;

import creational.design.pattern.factory.factory.method.concreteproduct.EmailNotification;
import creational.design.pattern.factory.factory.method.factory.NotificationFactory;
import creational.design.pattern.factory.factory.method.product.Notification;

public class EmailNotificationCreator extends NotificationFactory {
    @Override
    protected Notification createNotification() {
        return new EmailNotification();
    }
}
