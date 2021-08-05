package com.factory.absfactory.order;

import com.factory.absfactory.pizza.Pizza;

/**
 * 顶级工厂接口
 */
public interface AbsFactory {

    public Pizza creatrPizza();
}
