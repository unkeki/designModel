package com.example.designmodel.observer;

import java.util.ArrayList;
import java.util.List;

public class MySubject implements Subject{

    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void notifyObserver(String str) {
        observers.forEach(o -> o.notify(str));
    }
}
