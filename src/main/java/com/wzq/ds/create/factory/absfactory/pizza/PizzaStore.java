package com.wzq.ds.create.factory.absfactory.pizza;

public abstract class PizzaStore {

  // 而父类在编写时并不需要知道子类的具体实现即可调用
  public Pizza orderPizza(String type) {
    return createPizza(type);
  }

  // 工厂方法  和模板方法类似，在接口冲存放一个抽象方法，定义一个行为，在子类中加以实现
  abstract Pizza createPizza(String type);
}
