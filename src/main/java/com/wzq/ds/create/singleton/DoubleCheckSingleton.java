package com.wzq.ds.create.singleton;

// 只有第一次创建的时候需要加索
// volatile确保当变量被初始化成功后，多个线程可以共同看到最新的变化
public class DoubleCheckSingleton {

  private DoubleCheckSingleton() {}

  private static volatile Heart singleHeart;

  public static Heart getSingleHeart() {
    if (singleHeart == null) {
      synchronized (DoubleCheckSingleton.class) {
        if (singleHeart == null) {
          singleHeart = new Heart();
        }
      }
    }
    return singleHeart;
  }
}
