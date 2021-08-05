package com.adapter.objectadapter;

/**
 * 适配器类
 *
 * @author mzb
 * @version 1.0.0
 * @ClassName VoltageAdapter
 * @Description TODO
 * @createTime 2021年07月21日 09:48:00
 */
public class VoltageAdapter  implements IVoltage5V {

    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5v() {
        int dst = 0;
        if (voltage220V == null) {
            return dst;
        }
        //获取输出电压
        int src = voltage220V.output();
        System.out.println("开始转换电压");
        dst = src / 44;
        return dst;
    }
}
