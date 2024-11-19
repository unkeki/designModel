package com.example.designmodel.chain;

import org.springframework.stereotype.Component;

@Component
public class StockHandler implements OrderHandler{
    @Override
    public boolean handle(Order order) {
        if (order.getQuantity() > 20){
            System.out.println("库存不足");
            return false;
        }
        return true;
    }
}
