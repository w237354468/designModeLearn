package com.wzq.ds.behavior.strategy;

import com.wzq.ds.behavior.strategy.fly.NoFly;
import com.wzq.ds.behavior.strategy.quack.MuteQuack;

public class ModelDuck extends Duck {
  public void display() {}

  public static void main(String[] args) {
    Duck duck = new ModelDuck();
    duck.setFlyBehavior(new NoFly());
    duck.setQuackBehavior(new MuteQuack());
    duck.performFly();
    duck.performQuack();
    duck.swim();
  }
}
