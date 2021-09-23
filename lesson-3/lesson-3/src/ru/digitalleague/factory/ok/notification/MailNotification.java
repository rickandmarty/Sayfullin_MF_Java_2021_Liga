package ru.digitalleague.factory.ok.notification;


import ru.digitalleague.factory.ok.User;

public class MailNotification implements Notification {

    private String body;
    private User user;
    private boolean hasAdvertisement;
    private String language;


    public MailNotification(String body, User user, boolean hasAdvertisement) {
        this.body = body;
        this.user = user;
        this.hasAdvertisement = hasAdvertisement;
        this.language = user.getLanguage();
    }

    public String getText() {
        return String.format(
                "Address: %s\nУважаемый %s,\n%s%s\nС уважением, команда поддержки!",
                user.getEmail(),
                user.getName(),
                body,
                hasAdvertisement ? "\n\nПокупайте наши товары!\n" : ""
        );
    }
}
