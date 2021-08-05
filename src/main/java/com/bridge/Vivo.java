package com.bridge;

/**
 * @author mzb
 * @version 1.0.0
 * @ClassName Vivo
 * @Description TODO
 * @createTime 2021年07月22日 09:45:00
 */
public class Vivo implements Brand {
    @Override
    public void open() {
        System.out.println("vivo开机");
    }

    @Override
    public void call() {
        System.out.println("vivo打电话");
    }

    @Override
    public void close() {
        System.out.println("vivo关机");
    }
}
