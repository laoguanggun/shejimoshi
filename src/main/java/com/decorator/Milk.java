package com.decorator;

/**
 * @author mzb
 * @version 1.0.0
 * @ClassName Milk
 * @Description TODO
 * @createTime 2021年07月26日 09:53:00
 */
public class Milk extends Decorator {

    public Milk(Drink drink) {
        super(drink);
        setDes("牛奶");
        setPrise(5);
    }
}
