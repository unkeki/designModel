package com.example.designmodel.chain;

import org.springframework.stereotype.Component;

@Component
public class OrderService {

    private final OrderHandlerChain handlerChain;

    private OrderService(OrderHandlerChain handlerChain){
        this.handlerChain = handlerChain;
    }

    public boolean processOrder(Order order){
        boolean process = handlerChain.process(order);
        if (process){
            System.out.println("校验成功");
        }
        return process;
    }
}
