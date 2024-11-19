package com.example.designmodel.chain;

import org.springframework.stereotype.Component;

@Component
public class CreditHandler implements OrderHandler{
    @Override
    public boolean handle(Order order) {
        if (order.getCreditScore() % 2 != 0){
            System.out.println("信用不足");
            return false;
        }
        return true;
    }
}
