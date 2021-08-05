package com.factory.simplefactory.order;

import com.factory.simplefactory.pizza.Pizza;

/**
 * Pizza点餐类
 */
public class OrderPizza {

    private Pizza pizza;

    public OrderPizza(SimpleFactory simpleFactory) {
        pizza = simpleFactory.getPizzaType();
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
