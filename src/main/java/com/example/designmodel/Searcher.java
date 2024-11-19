package com.example.designmodel;


import cn.hutool.core.util.ObjectUtil;

public class Searcher extends AbstractSearcher{

    public Searcher(IGoodTemperamentGirl goodTemperamentGirl) {
        super(goodTemperamentGirl);
    }

    public Searcher(IGoodBodyGirl goodBodyGirl) {
        super(goodBodyGirl);
    }

    @Override
    public void show() {
        if (ObjectUtil.isNotEmpty(super.goodBodyGirl)){
            super.goodBodyGirl.goodFigure();
            super.goodBodyGirl.goodLooking();
        }
        if (ObjectUtil.isNotEmpty(super.goodTemperamentGirl)){
            super.goodTemperamentGirl.goodTemperament();
        }
    }
}
