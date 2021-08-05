package com.decorator;

/**
 * @author mzb
 * @version 1.0.0
 * @ClassName Coffee
 * @Description TODO
 * @createTime 2021年07月26日 09:44:00
 */
public class Coffee extends Drink {
    @Override
    public int cost() {
        return super.getPrise();
    }
}
