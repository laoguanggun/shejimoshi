package com.decorator;

/**
 * @author mzb
 * @version 1.0.0
 * @ClassName Decorator
 * @Description TODO
 * @createTime 2021年07月26日 09:47:00
 */
public class Decorator extends Drink {
    /**
     * 被装饰者对象
     */
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }


    @Override
    public int cost() {
        //自己的价格+被装饰者的价格
        return getPrise() + drink.cost();
    }
}
