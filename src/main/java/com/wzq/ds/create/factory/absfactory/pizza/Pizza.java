package com.wzq.ds.create.factory.absfactory.pizza;

import com.wzq.ds.create.factory.absfactory.ingredient.Cheese;
import com.wzq.ds.create.factory.absfactory.ingredient.Dough;
import com.wzq.ds.create.factory.absfactory.ingredient.Sauce;

import java.util.StringJoiner;

public abstract class Pizza {
  public String name;
  public Dough dough;
  public Sauce sauce;
  public Cheese cheese;

 public abstract void prepare();

  void bake() {
    System.out.println("Bake for 25 minutes at 350");
  }

  void cut() {
    System.out.println("Cutting the pizza into diagonal slices");
  }

  void box() {
    System.out.println("Place pizza in official PizzaStore box");
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Pizza.class.getSimpleName() + "[", "]")
        .add("name='" + name + "'")
        .add("dough=" + dough)
        .add("sauce=" + sauce)
        .add("cheese=" + cheese)
        .toString();
  }
}
