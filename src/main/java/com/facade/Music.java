package com.facade;

/**
 * 音响类
 * @author mzb
 * @version 1.0.0
 * @ClassName Music
 * @Description TODO
 * @createTime 2021年07月30日 10:08:00
 */
public class Music {

    private static Music mov = new Music();

    public static Music getInstance() {
        return mov;
    }

    public void on() {
        System.out.println("打开音响");
    }

    public void stop() {
        System.out.println("暂停音响");
    }

    public void off() {
        System.out.println("音响关闭");
    }

}
