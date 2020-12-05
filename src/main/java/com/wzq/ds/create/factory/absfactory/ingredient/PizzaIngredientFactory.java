package com.wzq.ds.create.factory.absfactory.ingredient;

public interface PizzaIngredientFactory {

  Dough createDough();

  Sauce createSauce();

  Cheese createCheese();
}
