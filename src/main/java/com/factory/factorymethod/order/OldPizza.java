package com.factory.factorymethod.order;

import com.factory.factorymethod.pizza.CheesePizza;
import com.factory.factorymethod.pizza.ChinaPizza;
import com.factory.factorymethod.pizza.Pizza;

/**
 * 经典款
 */
public class OldPizza extends OrderPizza{

    public OldPizza(String pizzaName) {
        super(pizzaName);
    }

    @Override
    public Pizza createPizza(String pizzaName) {
        Pizza pizza = null;
        if ("cheese".equals(pizzaName)) {
            pizza = new CheesePizza();
            pizza.setPizzaName("CheesePizza");
        } else if ("china".equals(pizzaName)) {
            pizza = new ChinaPizza();
            pizza.setPizzaName("ChinaPizza");
        }
        return pizza;
    }

}
