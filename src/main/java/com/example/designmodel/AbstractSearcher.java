package com.example.designmodel;

public abstract class AbstractSearcher {

    protected IGoodBodyGirl goodBodyGirl;
    protected IGoodTemperamentGirl goodTemperamentGirl;

    public AbstractSearcher(IGoodTemperamentGirl goodTemperamentGirl) {
        this.goodTemperamentGirl = goodTemperamentGirl;
    }

    public AbstractSearcher(IGoodBodyGirl goodBodyGirl){
        this.goodBodyGirl = goodBodyGirl;
    }

    public abstract void show();
}
