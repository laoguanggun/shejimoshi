package com.flyweight;

/**
 * 抽象类
 * @author mzb
 * @version 1.0.0
 * @ClassName WebSite
 * @Description TODO
 * @createTime 2021年08月02日 10:42:00
 */
public abstract class WebSite {

    /**
     * 需要子类实现的类
     */
    public abstract void use(User user);
}
