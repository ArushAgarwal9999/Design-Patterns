package com.example.disignpatterns.observerdesignpattern;

import com.example.disignpatterns.observerdesignpattern.observable.IphoneObservableImpl;
import com.example.disignpatterns.observerdesignpattern.observable.Observable;
import com.example.disignpatterns.observerdesignpattern.observer.EmailNotificationObserver;
import com.example.disignpatterns.observerdesignpattern.observer.Observer;
import com.example.disignpatterns.observerdesignpattern.observer.PhoneNotificationObserver;

public class Main {
    public static void main(String[] args)
    {
        Observable ob  = new IphoneObservableImpl();
        Observer o1 = new EmailNotificationObserver(ob,"abc@gmail.com");
        Observer o2 = new EmailNotificationObserver(ob,"xyz@gmail.com");
        Observer o3 = new PhoneNotificationObserver(ob,"arush");
        ob.add(o1);
        ob.add(o2);
        ob.add(o3);

        ob.update(10);
        ob.update(0);
        ob.update(10);
    }
}
