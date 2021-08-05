package com.template;

/**
 * @author mzb
 * @version 1.0.0
 * @ClassName Client
 * @Description TODO
 * @createTime 2021年08月04日 09:27:00
 */
public class Client {
    public static void main(String[] args) {
        //制作花生豆浆
        PeanutSoyMilk peanutSoyMilk = new PeanutSoyMilk();
        peanutSoyMilk.make();

        System.out.println("----------------");
        //制作红豆豆浆
        RedBeansSoyMilk redBeansSoyMilk = new RedBeansSoyMilk();
        redBeansSoyMilk.make();
        System.out.println("----------------");
        //制作纯豆浆
        PureSoyMilk pureSoyMilk = new PureSoyMilk();
        pureSoyMilk.make();
    }
}
