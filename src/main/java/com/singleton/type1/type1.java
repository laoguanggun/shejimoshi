package com.singleton.type1;

public class type1 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
    }

}

//饿汉式第一种写法
class Singleton{
    //私有化构造方法
    private Singleton(){
    }
    private final static Singleton singleton = new Singleton();

    public static Singleton getInstance() {
        return singleton;
    }
}
