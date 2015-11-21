package com.zhuxt.singleinstance;

/**
 * Created by Administrator on 2015/11/21.
 */
public class SingletonVolatile {

    private volatile static SingletonVolatile uniqueInstance;

    private SingletonVolatile() {

    }

    public static SingletonVolatile getUniqueInstance(){
        if (uniqueInstance == null) {

            synchronized (SingletonVolatile.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new SingletonVolatile();
                }
            }

        }

        return uniqueInstance;
    }

    public static void main(String[] args) {
        SingletonVolatile.getUniqueInstance();
    }
}
