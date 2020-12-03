package com.wzq.ds.factory.simple;

public class SimplePizzaFactory {

  public Pizza createPizza(String order) {

    return order.equals("cheese") ? new CheesePizza() : new ClamPizza();
  }
}
