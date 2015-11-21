package com.zhuxt.singleinstance;

/**
 * Created by Administrator on 2015/11/21.
 */
public class SingletonSync {

    private static SingletonSync uniqueInstance;

    private SingletonSync() {

    }

    public synchronized static SingletonSync getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonSync();
        }

        return uniqueInstance;
    }

    public static void main(String[] args) {

    }
}
