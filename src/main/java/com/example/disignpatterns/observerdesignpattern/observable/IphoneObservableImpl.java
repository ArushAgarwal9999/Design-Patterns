package com.example.disignpatterns.observerdesignpattern.observable;

import com.example.disignpatterns.observerdesignpattern.observer.Observer;

import java.util.HashSet;
import java.util.Iterator;

public class IphoneObservableImpl implements Observable {
    int currentStockCount = 0;
    HashSet<Observer> set = new HashSet<>();
    @Override
    public void add(Observer observer) {
        set.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        set.remove(observer);

    }

    @Override
    public void notifyObserver() {
        Iterator<Observer> it = set.iterator();
        while(it.hasNext())
        {
            Observer o = it.next();
            o.receiveNotification();

        }


    }

    @Override
    public void update(int count) {
        if(this.currentStockCount ==0)
            this.notifyObserver();
        this.currentStockCount  = count;

    }

    @Override
    public int getUpdate() {
        return this.currentStockCount;

    }
}
