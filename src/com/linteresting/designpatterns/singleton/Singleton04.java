package com.linteresting.designpatterns.singleton;

/**
 * 静态内部类
 */
public class Singleton04 {

    private Singleton04() {}

    private static class Singleton04Holder {
        private final static Singleton04 INSTANCE = new Singleton04();
    }

    public static Singleton04 getInstance() {
        return Singleton04Holder.INSTANCE;
    }

}
