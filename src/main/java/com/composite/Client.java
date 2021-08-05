package com.composite;

/**
 * @author mzb
 * @version 1.0.0
 * @ClassName Client
 * @Description TODO
 * @createTime 2021年07月29日 10:24:00
 */
public class Client {
    public static void main(String[] args) {
        //创建大学
        OrganizationComponent university = new University("清华大学", "清华大学");

        //创建院校
        OrganizationComponent college1 = new College("信息工程", "信息工程");
        OrganizationComponent college2 = new College("电子信息", "电子信息");

        //创建系
        OrganizationComponent department1 = new Department("专业1","专业1");
        OrganizationComponent department2 = new Department("专业2","专业2");
        OrganizationComponent department3 = new Department("专业3","专业3");
        OrganizationComponent department4 = new Department("专业4","专业4");

        //装填
        college1.add(department1);
        college1.add(department2);
        college2.add(department3);
        college2.add(department4);
        university.add(college1);
        university.add(college2);

        //打印
        university.print();
    }
}
