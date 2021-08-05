package com.bridge;

/**
 * @author mzb
 * @version 1.0.0
 * @ClassName UpRightPhone
 * @Description TODO
 * @createTime 2021年07月22日 09:48:00
 */
public class UpRightPhone extends Phone {

    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("直立手机");
    }

    @Override
    public void call() {
        super.call();
        System.out.println("直立手机");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("直立手机");

    }
}
