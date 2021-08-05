package com.template;

/**
 * @author mzb
 * @version 1.0.0
 * @ClassName SoyMilk
 * @Description TODO
 * @createTime 2021年08月04日 09:23:00
 */
public abstract class SoyMilk {

    void make() {
        select();
        if (flag()) {
            add();
        }
        beating();
    }

    private void select() {
        System.out.println("选材");
    }

    /**
     * 子类具体实现加调料
     */
    public abstract void add();

    private void beating() {
        System.out.println("打浆");
    }

    public boolean flag() {
        return true;
    }

}
