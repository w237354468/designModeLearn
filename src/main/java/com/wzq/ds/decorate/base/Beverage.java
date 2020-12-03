package com.wzq.ds.decorate.base;

// 基础类
public abstract class Beverage {
  String description = "Unknown Beverage";

  public String getDescription() {
    return description;
  }

  public abstract float cost();
}
