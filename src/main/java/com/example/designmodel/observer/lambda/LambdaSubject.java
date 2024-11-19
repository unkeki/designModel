package com.example.designmodel.observer.lambda;

import java.util.function.Consumer;

public interface LambdaSubject {

    /**
     * 观察者注册
     */
    void registerObserver(Consumer<String> o);

    /**
     * 通知所有观察者
     */
    void notifyObserver(String str);

}
