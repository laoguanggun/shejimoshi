package com.proxy.dynamic;

/**
 * @author mzb
 * @version 1.0.0
 * @ClassName Client
 * @Description TODO
 * @createTime 2021年08月03日 10:26:00
 */
public class Client {
    public static void main(String[] args) {
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(new TeacherDao()).getProxyInstance();
        //class com.sun.com.proxy.$Proxy0 表示获取的时代理对象
        System.out.println(proxyInstance.getClass());
        proxyInstance.teach();
    }
}
