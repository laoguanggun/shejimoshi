package com.decorator;

/**
 * @author mzb
 * @version 1.0.0
 * @ClassName CoffeeBar
 * @Description TODO
 * @createTime 2021年07月26日 09:57:00
 */
public class CoffeeBar {
    public static void main(String[] args) {

        Drink drink = new Espresso();

        //加一份牛奶
        drink = new Milk(drink);
        System.out.println(drink.cost());

    }
}
