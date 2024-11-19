package com.example.designmodel.observer;

/**
 * 模拟第三方支付
 */
public class Payment implements Observer{
    @Override
    public void notify(String str) {

        /**
         * 处理退款
         */
        System.out.println("第三方支付收到信息" + str);
    }
}
