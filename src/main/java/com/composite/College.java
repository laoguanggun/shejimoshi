package com.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mzb
 * @version 1.0.0
 * @ClassName College
 * @Description TODO
 * @createTime 2021年07月29日 10:22:00
 */
public class College extends OrganizationComponent {

    private List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

    public College(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    public void print() {
        System.out.println(getName());
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }
}
