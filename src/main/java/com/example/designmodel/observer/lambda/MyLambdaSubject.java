package com.example.designmodel.observer.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MyLambdaSubject implements LambdaSubject{

    private final List<Consumer<String>> observers = new ArrayList<>();

    @Override
    public void registerObserver(Consumer<String> o) {
        this.observers.add(o);
    }

    @Override
    public void notifyObserver(String str) {
        observers.forEach(o -> o.accept(str));
    }
}
