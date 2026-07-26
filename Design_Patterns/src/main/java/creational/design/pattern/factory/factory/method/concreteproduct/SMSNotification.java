package creational.design.pattern.factory.factory.method.concreteproduct;

import creational.design.pattern.factory.factory.method.product.Notification;

public class SMSNotification implements Notification {
    @Override
    public void send() {
        IO.println("Send SMS Notification...");
    }
}
