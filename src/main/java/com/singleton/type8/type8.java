package com.singleton.type8;

public class type8 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
    }
}

enum Singleton {
    INSTANCE;

    public void test() {
        System.out.println("enum");
    }
}
