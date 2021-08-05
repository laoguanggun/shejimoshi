package com.proxy.staticproxy;

/**
 * @author mzb
 * @version 1.0.0
 * @ClassName Client
 * @Description TODO
 * @createTime 2021年08月03日 09:46:00
 */
public class Client {
    public static void main(String[] args) {
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(new TeacherDao());
        teacherDaoProxy.teach();
    }
}
