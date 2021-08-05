package com.factory.simplefactory.order;

/**
 * 用户类 来点餐
 */
public class User {
    public static void main(String[] args) {
        //第一种方式
        new OrderPizza(new SimpleFactory("china"));

        //第二种方式
        SimpleFactory simpleFactory = new SimpleFactory();
        simpleFactory.setPizzaName("cheese");
        new OrderPizza(simpleFactory);
    }
}
