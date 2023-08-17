package com.example.disignpatterns.observerdesignpattern.observable;

import com.example.disignpatterns.observerdesignpattern.observer.Observer;

public interface Observable {
    public void add(Observer observer);
    public void remove(Observer observer);
    public void notifyObserver();
    public void update(int count);
    public int getUpdate();

}
