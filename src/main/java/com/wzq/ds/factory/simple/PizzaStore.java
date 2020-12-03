package com.wzq.ds.factory.simple;

public class PizzaStore {

  private final SimplePizzaFactory factory;

  public PizzaStore(SimplePizzaFactory factory) {
    this.factory = factory;
  }

  public Pizza orderPizza(String order) {
    return factory.createPizza(order);
  }
}
