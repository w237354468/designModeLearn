package com.wzq.ds.adaptor;

public class DuckTestDrive {

  public static void main(String[] args) {

//    MallardDuck duck = new MallardDuck();
    WildTurkey turkey = new WildTurkey();
    Duck adaptorDuck = new TurkeyAdaptor(turkey);
    adaptorDuck.quack();
    adaptorDuck.fly();
  }
}
