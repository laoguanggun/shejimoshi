package com.adapter.interfaceadapter;

/**
 * @author mzb
 * @version 1.0.0
 * @ClassName client
 * @Description TODO
 * @createTime 2021年07月21日 10:34:00
 */
public class client {
    public static void main(String[] args) {
        AbsAdapter adapter = new AbsAdapter() {
            @Override
            public void m1() {
                System.out.println("执行m1方法");
            }
        };
        adapter.m1();
    }
}
