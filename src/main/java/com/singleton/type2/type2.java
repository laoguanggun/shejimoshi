package com.singleton.type2;


public class type2 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
    }

}

/**
 * 饿汉式第二种写法
 */
class Singleton{
    /**
     * 私有化构造方法
     */
    private Singleton(){
    }
    private final static Singleton singleton;

    static {
        singleton = new Singleton();
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
