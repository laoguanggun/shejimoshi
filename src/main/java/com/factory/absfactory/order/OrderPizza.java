package com.factory.absfactory.order;

import com.factory.absfactory.pizza.Pizza;

public class OrderPizza {

    public OrderPizza(AbsFactory absFactory) {
        Pizza pizza = absFactory.creatrPizza();
        if (pizza != null) {
            pizza.paper();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } else {
            System.out.println("没有这种Pizza");
        }
    }
}
