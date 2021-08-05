package com.factory.absfactory.order;

import com.factory.absfactory.pizza.NewCheesePizza;
import com.factory.absfactory.pizza.NewChinaPizza;
import com.factory.absfactory.pizza.Pizza;

public class NewPizza implements AbsFactory {

    private String pizzaName;
    public NewPizza(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public Pizza creatrPizza() {
        Pizza pizza = null;
        if ("cheese".equals(pizzaName)) {
            pizza = new NewCheesePizza();
            pizza.setPizzaName("CheesePizza");
        } else if ("china".equals(pizzaName)) {
            pizza = new NewChinaPizza();
            pizza.setPizzaName("ChinaPizza");
        }
        return pizza;
    }
}
