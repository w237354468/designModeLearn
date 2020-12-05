package com.wzq.ds.create.factory.absfactory.ingredient;

import com.wzq.ds.create.factory.absfactory.ingredient.impl.MarinaraSauce;
import com.wzq.ds.create.factory.absfactory.ingredient.impl.ReggianoCheese;
import com.wzq.ds.create.factory.absfactory.ingredient.impl.ThinCrustDough;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
  @Override
  public Dough createDough() {
    return new ThinCrustDough();
  }

  @Override
  public Sauce createSauce() {
    return new MarinaraSauce();
  }

  @Override
  public Cheese createCheese() {
    return new ReggianoCheese();
  }
}
