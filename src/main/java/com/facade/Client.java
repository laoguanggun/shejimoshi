package com.facade;

/**
 * @author mzb
 * @version 1.0.0
 * @ClassName Client
 * @Description TODO
 * @createTime 2021年07月30日 10:11:00
 */
public class Client {
    public static void main(String[] args) {
        HomeFacade homeFacade = new HomeFacade();
        //开启家庭影院
        homeFacade.star();
        //暂停
        homeFacade.stop();
        //关闭
        homeFacade.stop();
    }
}
