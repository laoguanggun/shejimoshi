package com.factory.absfactory.order;

import com.factory.absfactory.pizza.CheesePizza;
import com.factory.absfactory.pizza.ChinaPizza;
import com.factory.absfactory.pizza.Pizza;

public class OldPizza implements AbsFactory {

    private String pizzaName;
    public OldPizza(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public Pizza creatrPizza() {
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
