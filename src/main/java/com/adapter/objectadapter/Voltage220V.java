package com.adapter.objectadapter;

/**
 * 被适配类 输出220v
 *
 * @author mzb
 * @version 1.0.0
 * @ClassName Voltage220V
 * @Description TODO
 * @createTime 2021年07月21日 09:45:00
 */
public class Voltage220V {

    public int output() {
        int src = 220;
        System.out.println("输出" + src + "v");
        return src;
    }
}
