package com.zhuxt.singleinstance;

/**
 * Created by Administrator on 2015/11/21.
 */
public class SingletonEagerly {

    private static SingletonEagerly uniqueInstance = new SingletonEagerly();

    private SingletonEagerly() {

    }

    public static SingletonEagerly getUniqueInstance() {

        return uniqueInstance;
    }

    public static void main(String[] args) {
        SingletonEagerly.getUniqueInstance();
    }
}
