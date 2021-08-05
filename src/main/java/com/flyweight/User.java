package com.flyweight;

/**
 * 外部状态
 * @author mzb
 * @version 1.0.0
 * @ClassName User
 * @Description TODO
 * @createTime 2021年08月02日 10:43:00
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
