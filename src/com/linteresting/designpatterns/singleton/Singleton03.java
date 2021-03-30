package com.linteresting.designpatterns.singleton;

/**
 * 双重检查
 */
public class Singleton03 {

    private static volatile Singleton03 INSTANCE;

    private Singleton03() {}

    // public synchronized Singleton03 getINSTANCE() {

    public Singleton03 getINSTANCE() {
        if(null == INSTANCE) {
            synchronized (Singleton03.class) {
                if (null == INSTANCE) {
                    INSTANCE = new Singleton03();
                }
            }
        }
        return INSTANCE;
    }

}
