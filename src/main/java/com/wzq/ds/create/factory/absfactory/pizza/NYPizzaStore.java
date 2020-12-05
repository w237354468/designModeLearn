package com.wzq.ds.create.factory.absfactory.pizza;

import com.wzq.ds.create.factory.absfactory.ingredient.NYPizzaIngredientFactory;
import com.wzq.ds.create.factory.absfactory.ingredient.PizzaIngredientFactory;
import com.wzq.ds.create.factory.absfactory.pizza.impl.CheesePizza;

public class NYPizzaStore extends PizzaStore {

  @Override
  public Pizza createPizza(String type) {
    Pizza pizza = null;
    PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
    if (type.equals("Cheese")) {
      pizza = new CheesePizza(ingredientFactory);
      pizza.setName("New York Style Veggie Pizza");
    }
    // 其他Pizza的判断
    return pizza;
  }
}
