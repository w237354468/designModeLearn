package com.wzq.ds.create.factory.simple;

public class PizzaStore {

  private final SimplePizzaFactory factory;

  public PizzaStore(SimplePizzaFactory factory) {
    this.factory = factory;
  }

  public Pizza orderPizza(String order) {
    Pizza pizza;
    pizza = factory.createPizza(order);

    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }
}
