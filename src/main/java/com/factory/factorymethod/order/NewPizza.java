package com.factory.factorymethod.order;

import com.factory.factorymethod.pizza.NewCheesePizza;
import com.factory.factorymethod.pizza.NewChinaPizza;
import com.factory.factorymethod.pizza.Pizza;

/**
 * 新款Pizza
 */
public class NewPizza extends  OrderPizza {


    public NewPizza(String pizzaName) {
        super(pizzaName);
    }

    @Override
    public Pizza createPizza(String pizzaName) {
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
