package com.example.designmodel.observer;

/**
 * 模拟站内信与短信
 */
public class Message implements Observer{
    @Override
    public void notify(String str) {

        /**
         *处理站内信与短信
         */
        System.out.println("发送站内信与短信" + str);
    }
}
