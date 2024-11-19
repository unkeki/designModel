package com.example.designmodel;

public class PettyGirl implements IGoodBodyGirl, IGoodTemperamentGirl{

    private String name;

    public PettyGirl(String name){
        this.name = name;
    }

    @Override
    public void goodLooking() {
        System.out.println(this.name + "----脸蛋很好看");
    }

    @Override
    public void goodFigure() {
        System.out.println(this.name + "----身材很棒");
    }

    @Override
    public void goodTemperament() {
        System.out.println(this.name + "----气质很好");
    }
}
