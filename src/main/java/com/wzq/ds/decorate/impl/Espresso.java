package com.wzq.ds.decorate.impl;

import com.wzq.ds.decorate.base.Beverage;

public class Espresso extends Beverage {
  @Override
  public float cost() {
    return 36;
  }

  @Override
  public String getDescription() {
    return "Espresso";
  }
}
