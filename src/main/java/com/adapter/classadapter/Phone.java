package com.adapter.classadapter;

/**
 * 使用适配器的类
 * @author mzb
 * @version 1.0.0
 * @ClassName Phone
 * @Description TODO
 * @createTime 2021年07月21日 09:50:00
 */
public class Phone {
    public void recharge(IVoltage5V iVoltage5V) {
        if (iVoltage5V.output5v() == 5) {
            System.out.println("开始充电");
        } else {
            System.out.println("电压过大");
        }
    }
}
