package com.example.designmodel.singleton;

public class Minister {
    public static void main(String[] args) {
        for (int i = 0; i<3; i++){
            Emperor instance = Emperor.getInstance();
            instance.say();
//            Emperor emperor = new Emperor();
//            System.out.println(emperor);
////            emperor.say();
        }
    }
}
