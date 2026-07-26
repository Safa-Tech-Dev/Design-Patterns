package creational.design.pattern.factory.factory.method.concreteproduct;

import creational.design.pattern.factory.factory.method.product.Notification;

public class EmailNotification implements Notification {
    @Override
    public void send() {
        IO.println("Send Email Notification...");
    }
}
