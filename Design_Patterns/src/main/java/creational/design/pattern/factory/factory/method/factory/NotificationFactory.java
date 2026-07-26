package creational.design.pattern.factory.factory.method.factory;

import creational.design.pattern.factory.factory.method.product.Notification;

public abstract class NotificationFactory {

    protected abstract Notification createNotification();

    public void notifyUser(){

        Notification notification = createNotification();
        notification.send();
    }

}
