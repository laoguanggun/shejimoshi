package com.facade;

/**
 * 爆米花类
 * @author mzb
 * @version 1.0.0
 * @ClassName Popcorn
 * @Description TODO
 * @createTime 2021年07月30日 10:05:00
 */
public class Popcorn {

    private static Popcorn popcorn = new Popcorn();

    public static Popcorn getInstance() {
        return popcorn;
    }

    public void on() {
        System.out.println("打开爆米花机");
    }

    public void poping() {
        System.out.println("开始爆米花");
    }

    public void off() {
        System.out.println("爆米花机关机");
    }
}
