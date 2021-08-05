package com.factory.simplefactory.order;

import com.factory.simplefactory.pizza.CheesePizza;
import com.factory.simplefactory.pizza.ChinaPizza;
import com.factory.simplefactory.pizza.Pizza;

/**
 * 简单工厂用于创建Pizza对象
 */
public class SimpleFactory {

    private String pizzaName;

    public SimpleFactory() {

    }

    public SimpleFactory(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    /**
     * @return
     */
    public Pizza getPizzaType() {
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
