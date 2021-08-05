package com.factory.factorymethod.order;


import com.factory.factorymethod.pizza.Pizza;

/**
 * Pizza点餐类
 */
public abstract class OrderPizza {

    private Pizza pizza;

    public OrderPizza(String pizzaName) {
        pizza = createPizza(pizzaName);
        if (pizza != null) {
            pizza.paper();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } else {
            System.out.println("没有这种Pizza");
        }
    }

    public abstract Pizza createPizza(String pizzaName);
}
