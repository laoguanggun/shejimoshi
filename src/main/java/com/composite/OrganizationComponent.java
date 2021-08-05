package com.composite;

/**
 * @author mzb
 * @version 1.0.0
 * @ClassName OrganizationComponent
 * @Description TODO
 * @createTime 2021年07月29日 10:18:00
 */
public abstract class OrganizationComponent {

    /**
     * 名称
     */
    private String name;

    /**
     * 介绍
     */
    private String des;

    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    protected void add(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException();
    }


    protected void remove(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException();
    }

    /**
     * 打印方法
     */
    public abstract void print();
}
