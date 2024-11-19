package com.example.designmodel.observer;

import com.example.designmodel.observer.lambda.MyLambdaSubject;
import org.junit.Test;

/**
 * 场景：用户申请退款，系统同意退款，需要通知物流、发送站内信与短信、调用支付接口进行退款
 * 这种时候通常可以使用观察者模式来实现
 *
 * 使用lambda表达式替代观察者模式
 */
public class Demo {

    @Test
    public void test01(){
        MySubject mySubject = new MySubject();
        mySubject.registerObserver(new Message());
        mySubject.registerObserver(new Logistics());
        mySubject.registerObserver(new Payment());
        mySubject.notifyObserver("退款成功");
    }

    @Test
    public void test02(){
        MyLambdaSubject myLambdaSubject = new MyLambdaSubject();
        myLambdaSubject.registerObserver((String str) -> {
            System.out.println("发送站内信与短信" + str);
        });
        myLambdaSubject.registerObserver((String str) -> {
            System.out.println("物流收到信息" + str);
        });
        myLambdaSubject.registerObserver((String str) -> {
            System.out.println("第三方支付收到信息" + str);
        });
        myLambdaSubject.notifyObserver("退款成功");
    }
}
