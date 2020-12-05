package com.wzq.ds.create.factory.absfactory.pizza.impl;

import com.wzq.ds.create.factory.absfactory.ingredient.PizzaIngredientFactory;
import com.wzq.ds.create.factory.absfactory.pizza.Pizza;

public class CheesePizza extends Pizza {

  PizzaIngredientFactory ingredientFactory;

  public CheesePizza(PizzaIngredientFactory ingredientFactory) {
    this.ingredientFactory = ingredientFactory;
  }

  @Override
  public void prepare() {
    System.out.println("Preparing " + name);
    dough = ingredientFactory.createDough();
    sauce = ingredientFactory.createSauce();
    cheese = ingredientFactory.createCheese();
  }
}
