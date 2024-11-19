package com.example.designmodel.observer;

/**
 * 模拟第三方物流
 */
public class Logistics implements Observer{
    @Override
    public void notify(String str) {
        /**
         * 处理拦截货物动作
         */
        System.out.println("物流收到信息" + str);
    }
}
