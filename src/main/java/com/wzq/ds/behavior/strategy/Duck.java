package com.wzq.ds.behavior.strategy;

import com.wzq.ds.behavior.strategy.fly.FlyBehavior;
import com.wzq.ds.behavior.strategy.quack.QuackBehavior;

public abstract class Duck {

  private QuackBehavior quackBehavior;
  private FlyBehavior flyBehavior;

  public Duck() {}

  public void setFlyBehavior(FlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }

  public void setQuackBehavior(QuackBehavior quackBehavior) {
    this.quackBehavior = quackBehavior;
  }

  public abstract void display();

  // 多态
  public void performFly() {
    flyBehavior.fly();
  }

  // 多态
  public void performQuack() {
    quackBehavior.quack();
  }

  public void swim() {
    System.out.println("all ducks float, even decoys");
  }
}
