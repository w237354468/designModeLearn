package com.wzq.ds.create.factory.factorymethod.store;

import com.wzq.ds.create.factory.simple.CheesePizza;
import com.wzq.ds.create.factory.simple.ClamPizza;
import com.wzq.ds.create.factory.simple.Pizza;

public class NyPizzaStore extends PizzaStore {
  @Override
   public Pizza createPizza(String type) {
    if (type.equals("cheese")) {
      return new CheesePizza();
    } else {
      return new ClamPizza();
    }
  }
}
