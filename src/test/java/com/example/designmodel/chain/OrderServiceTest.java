package com.example.designmodel.chain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OrderServiceTest {

    @Autowired
    private OrderService orderService;

    @Test
    public void testOrderProcess(){
        Order order = new Order(2, 5);
        orderService.processOrder(order);

        Order order1 = new Order(2, 5);
        orderService.processOrder(order1);

        Order order2 = new Order(2, 21);
        orderService.processOrder(order2);
    }

}