package com.wzq.ds.decorate;

import com.wzq.ds.decorate.impl.Espresso;
import com.wzq.ds.decorate.impl.Mocha;

public class Test {

  public static void main(String[] args) {

    Espresso espresso = new Espresso();
    Mocha esWithMocha = new Mocha(espresso);
    System.out.println("您点的是"+esWithMocha.getDescription());
    System.out.println("总价格是"+esWithMocha.cost());
  }
}
