package com.wzq.ds.create.singleton;

public class LazySingleton2 {
  private LazySingleton2() {}

  private static Heart singleHeart;

  //缺点：除了第一次需要加锁保证安全以外，以后的每次调用都需要要加锁累赘
  public static synchronized Heart getSingleHeart() {
    if (singleHeart == null) {
      singleHeart = new Heart();
    }
    return singleHeart;
  }
}
