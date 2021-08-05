package com.factory.absfactory.pizza;

/**
 * Pizza的抽象类
 */
public abstract class Pizza {

    /**
     * pizzaName 名称
     */
    private String pizzaName;

    /**
     * 原材料抽象方法，让子类自己实现
     */
    public abstract void paper();

    public void bake() {
        System.out.println(pizzaName + "制作中");
    }

    public void cut() {
        System.out.println(pizzaName + "切片中");
    }

    public void box() {
        System.out.println(pizzaName + "打包中");
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

}
