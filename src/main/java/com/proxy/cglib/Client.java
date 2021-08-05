package com.proxy.cglib;

/**
 * @author mzb
 * @version 1.0.0
 * @ClassName Client
 * @Description TODO
 * @createTime 2021年08月03日 10:55:00
 */
public class Client {
    public static void main(String[] args) {
//        TeacherDao proxyInstance = (TeacherDao) new ProxyFactory(new TeacherDao()).getProxyInstance();
//        proxyInstance.teach();
        TeacherDao teacherDao = new TeacherDao();
        test(teacherDao);
        System.out.println(teacherDao.getName());
    }

    public static void test(TeacherDao teacherDao) {
        teacherDao.setName("tom");
    }
}
