package com.wzq.ds.create.singleton;

// 线程安全 缺点：浪费内存
public class AngrySingleton {
  private AngrySingleton() {}

  private static final Heart singleHeart = new Heart();

  public static Heart getSingleHeart() {
    return singleHeart;
  }
}
