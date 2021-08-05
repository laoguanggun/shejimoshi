package com.bridge;

/**
 * 手机抽象类作为手机桥
 * @author mzb
 * @version 1.0.0
 * @ClassName Phone
 * @Description TODO
 * @createTime 2021年07月22日 09:46:00
 */
public abstract class Phone {

    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    public void open() {
        brand.open();
    }

    public void call() {
        brand.call();
    }

    public void close() {
        brand.close();
    }
}
