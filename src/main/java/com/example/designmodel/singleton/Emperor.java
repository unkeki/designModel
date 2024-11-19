package com.example.designmodel.singleton;

public class Emperor {

    // 饿汉模式
    private static final Emperor emperor = new Emperor();

    // 限制产生多个对象
    private Emperor(){
    }

    public static Emperor getInstance(){
        return emperor;
    }

    public void say(){
        System.out.println("我是皇帝AAAAA");
//        System.out.println(emperor);
    }

    // 懒汉模式
//    private static final Emperor emperor = null;
//    public synchronized static Emperor getInstance(){
//        if (emperor == null){
//            emperor = new Emperor();
//        }
//        return emperor
//    }
}
