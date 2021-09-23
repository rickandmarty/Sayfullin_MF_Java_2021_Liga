package ru.digitalleague.factory.ok;

import ru.digitalleague.factory.ok.notification.MailNotification;
import ru.digitalleague.factory.ok.notification.Notification;
import ru.digitalleague.factory.ok.notification.NotificationDecorator;
import ru.digitalleague.factory.ok.notification.factory.NotificationFactory;
import ru.digitalleague.factory.ok.notification.factory.MailNotificationFactory;
import ru.digitalleague.factory.ok.notification.factory.PhoneNotificationFactory;

public class Main {

    public static void main(String[] args) {
        Translates translates = new Translates();
        translates.fill();
        User user = new User(2L, "Денис", "denis@gmail.com", "+79522668105", "kk");
        String ends = translates.getValue(user.getLanguage());

        MailNotification mailNotification = new MailNotification("Доброго дня!",user,false);
        NotificationDecorator mailNotificationDecorator = new NotificationDecorator(mailNotification,ends);
        System.out.println(mailNotificationDecorator.getText());
    }
}
