package com.wzq.ds.decorate.impl;

import com.wzq.ds.decorate.base.Beverage;
import com.wzq.ds.decorate.base.CondimentDecorator;

public class Mocha extends CondimentDecorator {

  private Beverage beverage;

  public Mocha(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return this.beverage.getDescription() + " + mocha ";
  }

  @Override
  public float cost() {
    return this.beverage.cost() + 2;
  }
}
