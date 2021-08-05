package com.singleton.type3;

public class type3 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
    }
}

/**
 * 懒汉式线程不安全
 */
class Singleton{
    private static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
