package com.adapter.classadapter;

/**
 * @author mzb
 * @version 1.0.0
 * @ClassName Client
 * @Description TODO
 * @createTime 2021年07月21日 09:51:00
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.recharge(new VoltageAdapter());
    }
}
