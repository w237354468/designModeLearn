package com.wzq.ds.adaptor;

public class TurkeyAdaptor implements Duck {

  private final Turkey turkey;

  public TurkeyAdaptor(Turkey turkey) {
    this.turkey = turkey;
  }

  @Override
  public void quack() {
    turkey.gobble();
  }

  @Override
  public void fly() {
    turkey.fly();
  }
}
