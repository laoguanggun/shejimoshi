package com.singleton.type6;

public class type6 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
    }
}

/**
 * 懒汉式线程安全
 */
class Singleton{
    private static volatile Singleton singleton;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
