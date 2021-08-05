package com.facade;

/**
 * 电影类
 * @author mzb
 * @version 1.0.0
 * @ClassName Mov
 * @Description TODO
 * @createTime 2021年07月30日 10:07:00
 */
public class Mov {
    private static Mov mov = new Mov();

    public static Mov getInstance() {
        return mov;
    }

    public void on() {
        System.out.println("打开电影");
    }

    public void stop() {
        System.out.println("暂停");
    }

    public void off() {
        System.out.println("电影关闭");
    }
}
