package com.bridge;

/**
 * @author mzb
 * @version 1.0.0
 * @ClassName Client
 * @Description TODO
 * @createTime 2021年07月22日 09:49:00
 */
public class Client {
    public static void main(String[] args) {
        Phone upRightPhone = new UpRightPhone(new XiaoMi());
        upRightPhone.open();
        upRightPhone.call();
        upRightPhone.close();

    }
}
