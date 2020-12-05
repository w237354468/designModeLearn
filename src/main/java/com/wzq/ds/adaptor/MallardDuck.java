package com.wzq.ds.adaptor;

public class MallardDuck implements Duck {
  @Override
  public void quack() {
    System.out.println("Quack");
  }

  @Override
  public void fly() {
    System.out.println("Fly");
  }
}
