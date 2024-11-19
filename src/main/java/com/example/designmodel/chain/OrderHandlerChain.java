package com.example.designmodel.chain;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderHandlerChain {

    private final List<OrderHandler> handlers;

    public OrderHandlerChain(List<OrderHandler> handlers){
        this.handlers = handlers;
    }

    public boolean process(Order order){
        for (OrderHandler handler : handlers) {
            if (!handler.handle(order)){
                return false;
            }
        }
        return true;
    }
}
