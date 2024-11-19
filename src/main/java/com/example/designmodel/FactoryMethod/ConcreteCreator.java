package com.example.designmodel.FactoryMethod;

public class ConcreteCreator extends Creator{
    Product product = null;

    @Override
    public <T extends Product> T createProduct(Class<T> p) {
        try{
            product = (Product) Class.forName(p.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
