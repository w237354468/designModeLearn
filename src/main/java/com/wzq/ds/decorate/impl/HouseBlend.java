package com.wzq.ds.decorate.impl;

import com.wzq.ds.decorate.base.Beverage;

public class HouseBlend extends Beverage {
    @Override
    public float cost() {
        return 40;
    }

    @Override
    public String getDescription() {
        return "HouseBlend";
    }
}
