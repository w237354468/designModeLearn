package com.wzq.ds.factory.factorymethod.store;

import com.wzq.ds.factory.simple.Pizza;

public abstract class PizzaStore {

  public Pizza orderPizza(String type) {
    return createPizza(type);
  }

  // 工厂方法
  abstract Pizza createPizza(String  type);
}
