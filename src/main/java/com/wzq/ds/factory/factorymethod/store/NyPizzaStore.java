package com.wzq.ds.factory.factorymethod.store;

import com.wzq.ds.factory.simple.Pizza;

public class NyPizzaStore extends PizzaStore {
  @Override
  Pizza createPizza(String type) {
    if (type.equals("beaf")) {
      return null;
    }else {
      return null;
    }
  }
}
