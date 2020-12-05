package com.wzq.ds.create.factory.simple;

public class SimplePizzaFactory {

  public Pizza createPizza(String order) {

    return order.equals("cheese") ? new CheesePizza() : new ClamPizza();
  }
}
