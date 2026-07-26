package creational.design.pattern.factory.factory.method.client;

import creational.design.pattern.factory.factory.method.concretefactory.EmailNotificationCreator;
import creational.design.pattern.factory.factory.method.concretefactory.PushNotificationCreator;
import creational.design.pattern.factory.factory.method.concretefactory.SMSNotificationCreator;
import creational.design.pattern.factory.factory.method.factory.NotificationFactory;

public class NotificationMachine {

    static void main() {

        NotificationFactory sms = new SMSNotificationCreator();
        sms.notifyUser();

        NotificationFactory push = new PushNotificationCreator();
        push.notifyUser();

        NotificationFactory email = new EmailNotificationCreator();
        email.notifyUser();
    }
}
