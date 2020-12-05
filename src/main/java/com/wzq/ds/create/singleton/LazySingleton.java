package com.wzq.ds.create.singleton;
// 线程不安全
public class LazySingleton {

    private LazySingleton(){}

    private static Heart singleHeart;

    public static Heart getSingleHeart(){
        if(singleHeart == null){
            singleHeart = new Heart();
        }
        return singleHeart;
    }
}
