package com.composite;

/**
 * @author mzb
 * @version 1.0.0
 * @ClassName Department
 * @Description TODO
 * @createTime 2021年07月29日 10:23:00
 */
public class Department extends OrganizationComponent {
    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    public void print() {
        System.out.println(getName());
    }
}
