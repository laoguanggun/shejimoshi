package com.adapter.classadapter;

/**
 * 适配器类
 *
 * @author mzb
 * @version 1.0.0
 * @ClassName VoltageAdapter
 * @Description TODO
 * @createTime 2021年07月21日 09:48:00
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5v() {
        //获取输出电压
        int src = output();
        System.out.println("开始转换电压");
        return src / 44;
    }
}
