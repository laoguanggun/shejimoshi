package com.decorator;

/**
 * 饮品抽象类
 * @author mzb
 * @version 1.0.0
 * @ClassName Drink
 * @Description TODO
 * @createTime 2021年07月26日 09:42:00
 */
public abstract class Drink {

    /**
     * 饮品描述
     */
    private String des;

    /**
     * 饮品价格
     */
    private int prise;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    /**
     * 计算价格方法
     * @return 计算后的价格
     */
    public abstract int cost();
}
