package com.linteresting.designpatterns.singleton;

/**
 * 懒加载
 */
public class Singleton02 {

    private static Singleton02 INSTANCE;

    private Singleton02() {}

    public static Singleton02 getInstance() {
        if (null == INSTANCE) {
            // 线程不安全
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Singleton02();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println(Singleton02.getInstance().hashCode())).start();
        }
    }

}
