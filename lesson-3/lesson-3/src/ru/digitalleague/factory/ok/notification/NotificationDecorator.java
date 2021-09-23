package ru.digitalleague.factory.ok.notification;

import ru.digitalleague.factory.ok.Translates;
import ru.digitalleague.factory.ok.User;

public class NotificationDecorator implements Notification{
    Notification notification;
    String ends;


    public NotificationDecorator(Notification notification, String ends){
        this.notification = notification;
        this.ends = ends;
    }

    @Override
    public String getText(){
        return notification.getText() + "\n" + ends;
    }
}
