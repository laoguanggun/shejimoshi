package com.factory.factorymethod.pizza;

/**
 * 中国特色披萨
 */
public class ChinaPizza extends Pizza {
    @Override
    public void paper() {
        System.out.println("中国特色披萨准备原材料中");
    }
}
