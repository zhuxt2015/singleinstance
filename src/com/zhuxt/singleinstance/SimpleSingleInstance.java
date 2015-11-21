package com.zhuxt.singleinstance;

/**
 * Created by Administrator on 2015/11/21.
 */
public class SimpleSingleInstance {

    private static  SimpleSingleInstance singleInstance;
    private  int count = 1;
    private SimpleSingleInstance() {
        System.out.println("count: " + count);
        count++;
    }

    public static SimpleSingleInstance getSingleInstance() {
        if (singleInstance == null) {
            singleInstance = new SimpleSingleInstance();
        }
        return singleInstance;
    }

    public static void main(String[] args) {

        TestThread t1 = new TestThread();
        TestThread t2 = new TestThread();
        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);
        th1.start();
        th2.start();
    }
}

class T extends Thread {
    @Override
    public void run() {
        super.run();
    }
}

class TestThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            SimpleSingleInstance.getSingleInstance();
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
