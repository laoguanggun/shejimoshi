package com.factory.factorymethod.pizza;

/**
 * 中国特色披萨
 */
public class NewChinaPizza extends Pizza {
    @Override
    public void paper() {
        System.out.println("新款中国特色披萨准备原材料中");
    }
}
