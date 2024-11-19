package com.example.designmodel.FactoryMethod;

public abstract class Creator {
    public abstract <T extends Product> T createProduct(Class<T> p);
}
