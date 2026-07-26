package creational.design.pattern.factory.factory.method.concreteproduct;

import creational.design.pattern.factory.factory.method.product.Notification;

public class PushNotification implements Notification {
    @Override
    public void send() {
        IO.println("Send Push Notification...");
    }
}
