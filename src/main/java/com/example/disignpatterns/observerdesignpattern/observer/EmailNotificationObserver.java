package com.example.disignpatterns.observerdesignpattern.observer;

import com.example.disignpatterns.observerdesignpattern.observable.Observable;

public class EmailNotificationObserver implements  Observer{
    Observable observable;
    String emailId;

    public EmailNotificationObserver(Observable observable, String emailId) {
        this.observable = observable;
        this.emailId = emailId;
    }

    @Override
    public void receiveNotification() {
        sendNotification("Send alert on email ID "+this.emailId);
    }
    public void sendNotification(String msg)
    {
        System.out.println(msg);
    }
}
