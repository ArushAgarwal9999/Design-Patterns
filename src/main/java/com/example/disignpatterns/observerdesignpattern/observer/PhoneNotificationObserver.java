package com.example.disignpatterns.observerdesignpattern.observer;

import com.example.disignpatterns.observerdesignpattern.observable.Observable;

public class PhoneNotificationObserver implements  Observer{
    Observable observable;
    String userName;

    public PhoneNotificationObserver(Observable observable, String userName) {
        this.observable = observable;
        this.userName = userName;
    }

    @Override
    public void receiveNotification() {
        sendNotification("Send alert on user "+this.userName);
    }
    public void sendNotification(String msg)
    {
        System.out.println(msg);
    }
}
