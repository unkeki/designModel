package com.example.designmodel.FactoryMethod;

public class Client {

    public static void main(String[] args) {
        ConcreteCreator concreteCreator = new ConcreteCreator();
        ConcreteProduct1 product = concreteCreator.createProduct(ConcreteProduct1.class);
        product.method1();
        product.method2();
    }
}
