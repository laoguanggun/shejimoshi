package com.bridge;

/**
 * @author mzb
 * @version 1.0.0
 * @ClassName XiaoMi
 * @Description TODO
 * @createTime 2021年07月22日 09:44:00
 */
public class XiaoMi implements Brand {
    @Override
    public void open() {
        System.out.println("小米开机");
    }

    @Override
    public void call() {
        System.out.println("小米打电话");
    }

    @Override
    public void close() {
        System.out.println("小米关机");
    }
}
