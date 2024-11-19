package com.example.designmodel.observer;

public interface Subject {

    /**
     * 观察者注册
     */
    void registerObserver(Observer o);

    /**
     * 通知所有观察者
     */
    void notifyObserver(String str);
}
